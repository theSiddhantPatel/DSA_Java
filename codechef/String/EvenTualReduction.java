// package String;

// import java.util.*;

// public class EvenTualReduction {

// public static void main(String[] args) throws java.lang.Exception {
// // your code goes here
// Scanner s = new Scanner(System.in);
// int t = s.nextInt();
// while (t-- > 0) {
// // boolean flag=true;
// int n = s.nextInt();
// String str = s.next();
// if (str.length() != n)
// break;
// if (str.length() % 2 != 0) {
// System.out.println("NO");
// break;
// }
// int count = 1;
// for (int i = 0; i < n - 1; i++) {
// for (int j = i + 1; j < n; j++) {
// if (str.charAt(i) == str.charAt(j))
// count++;
// }
// if (count % 2 == 0)
// continue;
// else
// System.out.println("NO");
// // flag =false;
// break;

// }
// System.out.println("Yes");

// }
// // s.close();
// }

// }

// by chatgpt 05/01/2024
package String;

import java.util.Scanner;

public class EvenTualReduction {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = s.nextInt(); // Length of the string
            String str = s.next();

            // If the string length is odd, immediately print "NO"
            if (str.length() % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            // Create an array to count character frequencies
            int[] freq = new int[26]; // For lowercase letters a-z

            // Count the occurrences of each character
            for (int i = 0; i < n; i++) {
                freq[str.charAt(i) - 'a']++;
            }

            // Check if all character frequencies are even
            boolean isEven = true;
            for (int count : freq) {
                if (count % 2 != 0) {
                    isEven = false;
                    break;
                }
            }

            // Print the result based on the flag
            if (isEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        s.close(); // Close the scanner
    }
}
