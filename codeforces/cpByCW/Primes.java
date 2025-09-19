// package codeforces.cpByCW;

// import java.util.Scanner;

// public class prime {
//     public static boolean Prime(int n) {
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         try (Scanner s = new Scanner(System.in)) {
//             int n = s.nextInt();
//             // if ((Prime(n)) == false) {
//             //     System.out.println(-1);
//             // } else
//              if (Prime(n - 2) == false) {
//                 System.out.println(-1);
//             } else {
//                 System.out.println(2 + " " + (n - 2));
//             }
//         }
//     }
// }

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }

        // Sieve up to n
        boolean[] isPrime = new boolean[n + 1];
        if (n >= 2) {
            for (int i = 2; i <= n; i++)
                isPrime[i] = true;
            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
        }

        // Find any two primes summing to n
        for (int p = 2; p <= n / 2; p++) {
            if (isPrime[p] && isPrime[n - p]) {
                System.out.println(p + " " + (n - p));
                return;
            }
        }

        System.out.println(-1);
    }
}
