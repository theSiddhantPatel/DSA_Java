// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class q2fib {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a = 0; a < t; a++) {
            long n = in.nextLong();
            long sum = getFibonacciSum(n);
            System.out.println(sum);
        }
    }

    private static long getFibonacciSum(long n) {
        long nextFib = 0;
        long sum = 0;
        for (int i = 1; nextFib < n; i++) {
            if (nextFib % 2 == 0)
                sum += nextFib;
            nextFib = getFibonacci(i);
            fibs.put(i, nextFib);
        }
        return sum;
    }

    private static long getFibonacci(int i) {
        if (fibs.containsKey(i))
            return fibs.get(i);
        if (i == 1 || i == 2)
            return 1;
        long fibValue = getFibonacci(i - 1) + getFibonacci(i - 2);
        fibs.put(i, fibValue);
        return fibValue;
    }

    private static Map<Integer, Long> fibs = new HashMap<>();
}
