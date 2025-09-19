import java.util.*;

public class start201 {
    static final long MOD = 998244353L;
    static int[] arr;
    static int[][] maxPos; // maxPos[l][r] = index of max in arr[l..r]
    static boolean[][] visited; // visited[l][r] = have we computed dp[l][r]?
    static long[][] dp; // dp[l][r] = number of arrays from arr[l..r]

    // DFS with memoization
    static long dfs(int l, int r) {
        if (l > r)
            return 0; // empty segment → no array
        if (visited[l][r])
            return dp[l][r];
        visited[l][r] = true;

        long count = 1; // count the current array itself

        if (r - l + 1 > 1) {
            // Option 1: skip first element
            if (l + 1 <= r) {
                int pos1 = maxPos[l + 1][r];
                // delete max from original array: split into left and right parts
                count = (count + dfs(l, pos1 - 1) + dfs(pos1 + 1, r)) % MOD;
            }

            // Option 2: skip last element
            if (l <= r - 1) {
                int pos2 = maxPos[l][r - 1];
                count = (count + dfs(l, pos2 - 1) + dfs(pos2 + 1, r)) % MOD;
            }
        }

        return dp[l][r] = count % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();

            // Precompute max positions for all subarrays
            maxPos = new int[N][N];
            for (int i = 0; i < N; i++) {
                int maxIdx = i;
                for (int j = i; j < N; j++) {
                    if (arr[j] > arr[maxIdx])
                        maxIdx = j;
                    maxPos[i][j] = maxIdx;
                }
            }

            visited = new boolean[N][N];
            dp = new long[N][N];

            System.out.println(dfs(0, N - 1));
        }
        sc.close();
    }
}
