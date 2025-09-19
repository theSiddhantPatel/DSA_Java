package codeforces.contest;

//https://codeforces.com/contest/2134/problem/A
import java.util.Scanner;

public class paintingWithTwoColors {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); // Number of test cases
        for (int testCase = 0; testCase < t; testCase++) {
            int n = s.nextInt();h0
            int a = s.nextInt();
            int b = s.nextInt();
            // boolean nEven = (n % 2 == 0);
            // boolean aEven = (a % 2 == 0);
            // boolean bEven = (b % 2 == 0);

            // if ((nEven && aEven && bEven) || (!nEven && !aEven && !bEven) ||
            // (b > a && ((nEven && bEven) || (!nEven && !bEven)))) {
            // System.out.println("YES");
            // } else {
            // System.out.println("NO");
            // }
            boolean allEven = (n % 2 == 0 && a % 2 == 0 && b % 2 == 0);
            boolean allOdd = (n % 2 == 1 && a % 2 == 1 && b % 2 == 1);
            boolean case3 = (b > a && (n % 2 == b % 2));

            if (allEven || allOdd || case3)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
