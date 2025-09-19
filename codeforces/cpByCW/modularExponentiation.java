import java.util.Scanner;

public class modularExponentiation {
    public static long powerFind(long a, long b, long m) {
        // for simplicity m=100; means m^ res =total value of the problem

        if (b == 0) {
            return 1;
        }
        long x = powerFind(a, b / 2, m) % m;
        long res;
        if (b % 2 == 1) {
            res = (x % m * x % m * a % m) % m;
        } else
            res = (x % m * x % m) % m;
        return res;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            long a = s.nextLong();
            long b = s.nextLong();
            long m = s.nextLong();
            System.out.println(powerFind(a, b, m));

        }
    }
}
