package codeforces.contest;
//https://codeforces.com/contest/2149/problem/B

import java.util.Arrays;
import java.util.Scanner;

public class unconventionalPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            int maxDiff = 0;
            for (int i = 1; i < n; i++) {
                maxDiff = Math.max(maxDiff, Math.abs(arr[i - 1] - arr[i]));
                i++;
            }
            System.out.println(maxDiff);

        }
    }
}
