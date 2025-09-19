package graph;

import java.util.Scanner;

public class l126 {
    static void Graph(int n, int m) {
        int[][] adj = new int[n + 1][m + 1];
        // Scanner s = new Scanner(System.in);
        // for (int i = 0; i < m; i++) {
        // int u, v;
        // u = s.nextInt();
        // v = s.nextInt();
        // adj[u][v] = 1;
        // adj[v][u] = 1;
        // edge 1---2
        adj[1][2] = 1;
        adj[2][1] = 1;
        // edge 2---4
        adj[2][4] = 1;
        adj[4][2] = 1;
        // edge 3---4
        adj[3][4] = 1;
        adj[4][3] = 1;
        // edge 3---5
        adj[3][5] = 1;
        adj[5][3] = 1;
        // edge 4---5
        adj[4][5] = 1;
        adj[5][4] = 1;
        // edge 1---3
        adj[1][3] = 1;
        adj[3][1] = 1;

    }

    }

    public static void main(String[] args) {

    }
}
