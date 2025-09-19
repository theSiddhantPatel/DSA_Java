package codeforces.contest;

import java.util.Scanner;

public class can {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long x = s.nextLong();
            StringBuilder sb = new StringBuilder();
            String str = String.valueOf(x);
            for (int i = 0; i < str.length(); i++) {
                int digit = str.charAt(i) - '0';
                int newDigit = digit > 4 ? 9 - digit : digit;
                if (i == 0 && newDigit == 0) {
                    sb.append(digit);
                } else
                    sb.append(newDigit);
            }
            System.out.println(sb.toString());
        }
    }
}
