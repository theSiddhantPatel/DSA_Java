package codeforces.contest;

import java.util.Scanner;

public class trippiTroppi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str1 = s.next();
            String str2 = s.next();
            String str3 = s.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str1.charAt(0));
            sb.append(str2.charAt(0));
            sb.append(str3.charAt(0));
            System.out.println(sb.toString());
        }
    }
}
