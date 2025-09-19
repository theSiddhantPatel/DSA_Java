package cw30;

import java.util.Scanner;

public class multiples {
    static void pm(int n, int k) {
        // base case
        if (k == 0) {
            return;
            // System.out.println(n);
        }
        // recursive work
        pm(n, k - 1);
        System.out.print((n * k) + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n");
        int n = s.nextInt();
        System.out.println("enter k");
        int k = s.nextInt();
        pm(n, k);
    }
}
// 