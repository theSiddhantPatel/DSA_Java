// package codeforces.contest;

import java.util.Scanner;

public class LRCandVIP {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int []arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=s.nextInt();
            }
            
        }
        System.out.println(gcd(14, 48));
    }
}
