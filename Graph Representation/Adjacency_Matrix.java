import java.util.Scanner;

public class Adjacency_Matrix {
    public static void main(String[] args) {
        // This representation pgm is in java lang. But you can easily convert it into
        // any lang.

        // define two variable i.e. vertices as V and edges as E
        int V, E;

        // Assign no. of vertices and edges
        V = 5;
        E = 6;

        // Create a V+1 and E+1 matrix because it is 1 based graph
        int adjM[][] = new int[V + 1][E + 1];

        // As it is 1 based graph do not use 0 index.
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= E; j++) {
                Scanner sc = new Scanner(System.in);

                int u = sc.nextInt(), v = sc.nextInt();

                // General from of assigning vertices
                adjM[u][v] = 1;
                adjM[v][u] = 1;

                sc.close();
            }
        }

        // T.C --> O(V X E)
        // S.C --> O(V X E)

    }
}