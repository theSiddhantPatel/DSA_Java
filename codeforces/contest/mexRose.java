package codeforces.contest;
//https://codeforces.com/contest/2149/problem/C

import java.util.HashSet;
import java.util.Scanner;

public class mexRose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            HashSet<Integer> set = new HashSet<>();
            int n = s.nextInt();
            int k = s.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                set.add(Math.abs(nums[i]) % k);
            }

            for (int i = 0; i < n; i++) {
                if (!set.contains(i)) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
