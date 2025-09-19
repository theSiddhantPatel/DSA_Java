package codeforces.contest;

import java.util.Scanner;

public class LargeArrayAndSegments {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            long x = s.nextLong();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int arr2[] = new int[k * n];
            int j = 0;
            for (int i = 0; i < k * n; i++) {
                arr2[i] = arr[j];
                j++;
                if (j == n) {
                    j = 0;
                }
            }
            int sum = 0;
            int r = 0;
            for (int i = 0; i < k * n; i++) {
                while (sum < x) {
                    sum += arr2[i];
                    r++;
                }

            }
            System.out.println(k*n-r+1);
        }
    }
}
