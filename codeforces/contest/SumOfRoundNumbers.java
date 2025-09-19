package codeforces.contest;

import java.util.Scanner;
import java.util.Stack;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                String numStr = String.valueOf(n);
                int count = 0;
                for (int i = 0; i < numStr.length(); i++) {
                    if (numStr.charAt(i) != '0') {
                        count++;
                    }
                }
                System.out.println(count);
                for (int i = 0; i < numStr.length(); i++) {
                    char ch = numStr.charAt(i);
                    if (ch != '0') {
                        StringBuilder part = new StringBuilder();
                        part.append(ch);
                        for (int j = i + 1; j < numStr.length(); j++) {
                            part.append('0'); // Append (len - i - 1) zeros
                        }
                        System.out.print(part + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
