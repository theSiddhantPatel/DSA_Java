import java.util.*;

@SuppressWarnings("resource")
public class LuckyDivision {
    // https://codeforces.com/problemset/problem/122/A
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] divisor = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };
        for (int i = 0; i < divisor.length; i++) {
            if (n % divisor[i] == 0) {
                System.out.println("YES");
                return;
            }
        }
        int count = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4' || str.charAt(i) == '7') {
                count++;
            }
        }
        System.out.println(count == str.length() ? "YES" : "NO");

    }
}
/*
 * Input: 799
 * Let’s analyze why the input 799 gives the output "YES".
 *
 * Step 1: Check if 799 is a Lucky Number
 * A lucky number contains only the digits 4 and 7.
 *
 * The digits of 799 are 7, 9, and 9.
 *
 * Since 9 is not a lucky digit (4 or 7), 799 is not a lucky number.
 *
 * Step 2: Check if 799 is Divisible by a Lucky Number
 *
 * We need to check if 799 is divisible by any lucky number.
 * Let’s break this down:
 *
 * What are Lucky Numbers?
 *
 * Lucky numbers are numbers that consist only of the digits 4 and 7.
 *
 * Examples include:
 * 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777, etc.
 */