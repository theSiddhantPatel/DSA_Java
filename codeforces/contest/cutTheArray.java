// package codeforces.contest;

// import java.util.Scanner;

// public class cutTheArray {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int t = s.nextInt();
//         while (t-- > 0) {
//             int n = s.nextInt();
//             int[] arr = new int[n];
//             int sum = 0;
//             for (int i = 0; i < n; i++) {
//                 arr[i] = s.nextInt();
//                 sum += arr[i];
//             }

//             if (sum % 3 != 0) {
//                 System.out.println(0 + " " + 0);
//             } else {
//                 System.out.println(n / 3 + " " + 2 * n / 3);
//                 // int s1 = 0;
//                 // for (int i = 0; i < n / 3; i++) {
//                 // s1 += arr[i];
//                 // }
//                 // int s2 = 0;
//                 // for (int i = n / 3; i < 2 * n / 3; i++) {
//                 // s2 += arr[i];
//                 // }
//                 // int s3 = 0;
//                 // for (int i = 2 * n / 3; i < n; i++) {
//                 // s3 += arr[i];
//                 // }
//                 // if (s1 % 3 != s2 % 3 && s2 % 3 != s3 % 3) {
//                 // System.out.println(n / 3 + " " + 2 * n / 3);
//                 // }
//                 // if (s1 % 3 == s2 % 3 && s2 % 3 != s3 % 3) {
//                 // System.out.println(n / 3 + " " + 2 * n / 3);
//                 // }
//             }
//         }
//     }
// }

import java.util.Scanner;

public class cutTheArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                sum += arr[i];
            }

            if (sum % 3 != 0) {
                System.out.println(0 + " " + 0);
            } else {
                System.out.println(n / 3 + " " + 2 * n / 3);

            }
        }
    }
}
