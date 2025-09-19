package codeforces.contest;

import java.util.Scanner;

public class addZeroOrk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Function to check if gcd of array > 1
    public static boolean isGCDGreaterThanOne(int[] arr) {
        int g = arr[0];
        for (int i = 1; i < arr.length; i++) {
            g = gcd(g, arr[i]);
            if (g == 1)
                return false; // Early stop
        }
        return g > 1;
    }
}
