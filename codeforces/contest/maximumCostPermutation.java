package codeforces.contest;

import java.util.Scanner;
import java.util.TreeSet;

public class maximumCostPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            TreeSet<Integer> s = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                s.add(i + 1);
            }

            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
                if (v[i] != 0) {
                    s.remove(v[i]);
                }
            }

            // Fill missing values in descending order
            for (int i = 0; i < n; i++) {
                if (v[i] == 0) {
                    int val = s.last(); // largest element
                    v[i] = val;
                    s.remove(val);
                }
            }

            int l = n + 1, r = n;
            for (int i = 0; i < n; i++) {
                if (v[i] != i + 1) {
                    r = i;
                    l = Math.min(l, i);
                }
            }

            System.out.println(r - l + 1);
        }
        sc.close();
    }
}
