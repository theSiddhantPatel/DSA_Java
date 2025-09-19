package cw28;

public class fibonacci {
    public static long printFibonacci(int n) {
        if (n == 0) {
            // System.out.print(0);
            return 0;
        }
        if (n == 1) {
            // System.out.print(1);/
            return 1;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);

    }
    public static void main(String[] args) {
        System.out.println(printFibonacci(100));
    }
}
