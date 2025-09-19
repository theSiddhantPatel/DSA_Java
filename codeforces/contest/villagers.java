package codeforces.contest;

//https://codeforces.com/contest/2133/problem/B
// to connect n villagers n-1 operations are required
import java.util.*;

public class villagers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] g = new int[n];
            for (int i = 0; i < n; i++) {
                g[i] = sc.nextInt();
            }
            Arrays.sort(g);
            long minEmeralds = 0;
            for (int i = n - 1; i >= 0; i -= 2) {
                minEmeralds += g[i];
            }
            System.out.println(minEmeralds);

        }
        sc.close();
    }

    // by using graph concept

}
