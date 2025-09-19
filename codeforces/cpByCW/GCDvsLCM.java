import java.util.Scanner;

public class GCDvsLCM {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                int d = s.nextInt();
                if (a + b + c + d == n) {
                    if (gcd(a, b) == (c * d / gcd(c, d))) {
                        System.out.println(a + " " + b + " " + c + " " + d);
                    }
                } else
                    System.out.println(-1);
            }
        }
    }
}
