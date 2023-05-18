import java.util.ArrayList;
import java.util.List;

public class DFS {
    static List<Integer> ans = new ArrayList<>();

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
        adjL(adj, 2, 3);
        adjL(adj, 2, 4);
        adjL(adj, 1, 5);

        DTraverse(adj, 1, new boolean[V + 1]);
        System.out.println(ans);
    }

    public static void adjL(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void DTraverse(List<List<Integer>> dfs, int startIndex, boolean[] vis) {
        if (vis[startIndex])
            return;
        vis[startIndex] = true;

        ans.add(startIndex);

        for (Integer each : dfs.get(startIndex)) {
            // if (!vis[each]) {
            DTraverse(dfs, each, vis);
            // }
        }
    }
}
