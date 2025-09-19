package codeforces.contest;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/contest/2133/problem/A
public class redstone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] teeths = new int[n];
            for (int i = 0; i < n; i++) {
                teeths[i] = s.nextInt();
            }
            Arrays.sort(teeths);
            boolean flag = false;
            for (int i = 0; i < n - 1; i++) {
                if (teeths[i] == teeths[i + 1]) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("NO");

        }
    }
}
