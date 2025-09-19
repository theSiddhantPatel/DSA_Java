import java.util.Scanner;

public class lcmGCD {
    public static int lcm(int a, int b) {
        int ans = 1;
        for (int i = 2; i <= Math.max(a, b)%Math.min(a,b);a>1;b>1; i++) {
            if (a % i == 0 && b % i == 0) {
                ans *= i;
                a /= i;
                b /= i;
                i-=1;
            }
        }
        if (a > 0) {
            ans *= a;
        }
        if (b > 0) {
            ans *= b;
        }
        return ans;
    }

    public static int gcd(int a, int b) {
        // one another formula is that (gcd=a*b/lcm );
        if (a == 0) {
            return b;
        }
        return gcd(a % b, b);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(lcm(a, b));
        }
    }
}
