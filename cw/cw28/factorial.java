package cw28;

import java.util.Scanner;

public class factorial {
    public static long printFactorial(int n) {
        // base case
        if (n == 1 /* || n == 1 */) {
            // System.out.println(1);/
            return 1;
        }
        // printFactorial(n - 1);
        long fact = n;
        // recrursive work
        fact *= printFactorial(n - 1);
        return fact;
    }

    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        // printFactorial(10);
        // int n;
        System.out.println("Enter n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(printFactorial(n));
        // printFactorial(n);
    }
}
