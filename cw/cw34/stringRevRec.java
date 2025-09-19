package cw34;

import java.util.Scanner;

public class stringRevRec {
    public static void stringrec2(String s, int idx) {
        if (s.length() == 0 || idx == s.length())
            return;

        stringrec2(s, idx + 1);
        System.out.print(s.charAt(idx));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        stringrec2(s, 0);
        scanner.close();
    }
}
