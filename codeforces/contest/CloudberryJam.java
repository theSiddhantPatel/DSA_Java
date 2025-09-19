package codeforces.contest;

import java.util.Scanner;

public class CloudberryJam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            System.out.println(2 * n);
        }
        s.close();
    }
}
