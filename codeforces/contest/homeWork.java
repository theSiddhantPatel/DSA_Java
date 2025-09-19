package codeforces.contest;

import java.util.Scanner;

//https://codeforces.com/contest/2132/problem/A
public class homeWork {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String str1 = s.next();
            int m = s.nextInt();
            String str2 = s.next();
            String str3 = s.next();
            int i = 0;
            while (i < m) {
                char ch = str2.charAt(i);
                if (str3.charAt(i) == 'D') {
                    str1 = str1 + ch;// string concatenation
                } else
                    str1 = ch + str1;
                i++;
            }
            System.out.println(str1);

        }
    }
}
