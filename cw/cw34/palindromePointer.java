package cw34;

import java.util.Scanner;

public class palindromePointer {
    static boolean ispalindrome(String s, int l, int r) {
        if (l >= r)  //self work
            return true;
        return (s.charAt(l) == s.charAt(r) && ispalindrome(s, l + 1, r - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(ispalindrome(s, 0, s.length() - 1));
        scanner.close();
    }
}
