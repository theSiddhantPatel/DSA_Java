package codeforces.contest;

import java.util.*;

public class gameOnArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            Map<Long, Long> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = s.nextLong();
                freq.put(x, freq.getOrDefault(x, 0L) + 1);
            }
            List<long[]> grp = new ArrayList<>();
            for (Map.Entry<Long, Long> entry : freq.entrySet()) {
                grp.add(new long[] { entry.getValue(), entry.getKey() });
            }
            grp.sort((A, B) -> {
                if (A[0] != B[0])
                    return Long.compare(B[0], A[0]);
                return Long.compare(B[1], A[1]);
            });

            long a = 0, b = 0;
            int turn = 0;
            for (long[] g : grp) {
                long c = g[0];
                long L = g[1];
                long a_moves = (L + (turn == 0 ? 1 : 0)) / 2;
                long b_moves = L - a_moves;

                a += a_moves * c;
                b += b_moves * c;

                if ((L & 1) == 1)
                    turn ^= 1;
            }

            System.out.println(a + " " + b);
        }

    }

}
