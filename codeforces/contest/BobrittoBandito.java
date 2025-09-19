package codeforces.contest;

import java.util.Scanner;

public class BobrittoBandito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int l = s.nextInt();
            int r = s.nextInt();
            // r-l=n
            // if (Math.abs(l)>=m) {
            // if (l>=0) {
            // System.out.print(0+" "+ l);
            // }
            // else System.out.println(l +" "+0);
            // }
            // else System.out.println(l+" ");
            int k = (m <= -l) ? m : -l;
            System.out.println((-k) + " " + (m - k));
        }
    }
}
