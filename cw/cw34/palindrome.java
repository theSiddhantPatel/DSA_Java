package cw34;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        String s = "madam";
        int j = s.length();
        for (int i = 0; i < (s.length()) / 2; i++) {
            if (s.charAt(i) == s.charAt(j - 1)) {
                j--;
                // System.out.print(1);
                continue;
            }
            // System.out.println(1);
            // return;
            else {
                System.out.println("string is not palindrome");
                break;
            }
            //
        }
        System.out.println(1);
    }
}
