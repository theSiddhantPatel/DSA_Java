package codeforces.contest;

//https://codeforces.com/contest/2132/problem/B
import java.util.*;

public class TheSecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            TreeSet<Long> results = new TreeSet<>();

            // try all possible k
            for (int k = 1; k <= 18; k++) {
                long factor = 1 + (long) Math.pow(10, k);
                if (n % factor == 0) {
                    long x = n / factor;
                    results.add(x);
                }
            }

            if (results.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.print(results.size() + " ");
                for (long x : results) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
