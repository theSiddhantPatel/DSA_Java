package codeforces.contest;
//https://codeforces.com/contest/2149/problem/A

import java.util.Scanner;

public class bePositive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();

            }
            int count0 = 0, count1 = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0)
                    count0++;
                else if (arr[i] == -1)
                    count1++;
            }
            if (count1 % 2 == 0)
                count1 = 0;
            else
                count1 = 2;
            int ops = count0 + count1;
            System.out.println(ops);

        }
    }
}
