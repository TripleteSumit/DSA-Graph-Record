import java.util.ArrayList;
import java.util.List;

/**
 * Provinence
 */

// PLink :- https://practice.geeksforgeeks.org/problems/number-of-provinces/0
public class Provinence {
    static List<Integer> res = new ArrayList<>();

    public static void main(String[] args) {
        int adjM[][] = { { 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

        dfs(adjM, 0, new boolean[adjM[0].length]);

        System.out.println(res);

    }

    static int numProvinces(ArrayList<ArrayList<Integer>> a, int V) {
        // code here

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (a.get(i).get(j) == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean vis[] = new boolean[V];

        int c = 0;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                c++;
                dfs(adj, i, vis);
            }
        }
        return c;
    }

    // You may apply any algo here. We need to just traverse it.
    public static void dfs(List<List<Integer>> adj, int startIndex, boolean vis[]) {
        if (vis[startIndex])
            return;
        vis[startIndex] = true;

        for (Integer x : adj.get(startIndex)) {
            dfs(adj, x, vis);
        }
    }

    // DFS using adj matrix
    public static void dfs(int[][] adjM, int startIndex, boolean vis[]) {
        if (startIndex >= adjM.length || vis[startIndex])
            return;
        vis[startIndex] = true;
        res.add(startIndex);
        for (int j = 0; j < adjM.length; j++) {
            if (adjM[startIndex][j] == 1)
                dfs(adjM, j, vis);
        }

    }
}