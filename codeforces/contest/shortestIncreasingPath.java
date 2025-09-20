package codeforces.contest;

import java.util.Scanner;

public class shortestIncreasingPath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            if ((x - y) == 1 || y == 1 || y == x)
                System.out.println(-1);
            else if (y > x)
                System.out.println(2);
            else
                System.out.println(3);

        }
    }
}
