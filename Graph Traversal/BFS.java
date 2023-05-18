import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * BFS
 */
public class BFS {

    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();

        // Assigning number of vertices only
        int V = 5;

        // Assigning V number of empty list to store the neighbour vetex
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        // Element asssignment
        adjL(adj, 1, 2);
        adjL(adj, 1, 5);
        adjL(adj, 5, 3);
        adjL(adj, 2, 3);
        adjL(adj, 2, 4);
        adjL(adj, 3, 4);

        List<Integer> ans = BTraversal(adj, V, 1);

        System.out.println(ans);
    }

    private static void adjL(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static List<Integer> BTraversal(List<List<Integer>> adj, int V, int startIndex) {
        Queue<Integer> q = new LinkedList<>();

        boolean vis[] = new boolean[V + 1];

        List<Integer> bfs = new ArrayList<>();

        vis[startIndex] = true;
        // bfs.add(startIndex);

        q.add(startIndex);

        while (!q.isEmpty()) {
            Integer ele = q.poll();
            bfs.add(ele);

            for (Integer x : adj.get(ele)) {
                if (!vis[x]) {
                    vis[x] = true;
                    q.add(x);
                }
            }
        }

        return bfs;
    }
}