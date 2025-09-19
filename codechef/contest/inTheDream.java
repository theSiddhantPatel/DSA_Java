package contest;

import java.util.Scanner;

public class inTheDream {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int max1 = Math.max(a, b);
            int min1 = Math.min(a, b);
            boolean firstHalf = (max1 <= 2 * (min1 + 1));
            int max2 = Math.max(c - a, d - b);
            int min2 = Math.min(c - a, d - b);
            boolean secondHalf = (max2 <= 2 * (min2 + 1));
            System.out.println((firstHalf && secondHalf) ? "YES" : "NO");
        }
    }
}
