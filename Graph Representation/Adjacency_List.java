import java.util.ArrayList;
import java.util.List;

public class Adjacency_List {
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
        adjL(adj, 2, 4);
        adjL(adj, 4, 5);
        adjL(adj, 5, 3);

        // Printing the Element in list format

        for (int i = 1; i <= V; i++) {
            System.out.print("" + i + " ---> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + "--->");
            }
            System.out.println();
        }

    }
    // neighbour ele assignment

    public static void adjL(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
