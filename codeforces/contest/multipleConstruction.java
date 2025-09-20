package codeforces.contest;

import java.util.*;

public class multipleConstruction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int size = 2 * n;
            int ptr = 1;
            boolean[] taken = new boolean[size + 1];
            int[] res = new int[size + 1];
            for (int val = n; val >= 1; val--) {
                while (taken[ptr])
                    ptr++;
                int firstIdx = ptr;
                int secondIdx = firstIdx + val;
                while (secondIdx <= size && taken[secondIdx]) {
                    secondIdx += val;
                }
                res[firstIdx] = val;
                res[secondIdx] = val;
                taken[firstIdx] = true;
                taken[secondIdx] = true;
            }
            for (int i = 1; i <= size; i++) {
                if (i > 1)
                    System.out.print(" ");
                System.out.print(res[i]);
            }
            System.out.println();
        }
    }
}
