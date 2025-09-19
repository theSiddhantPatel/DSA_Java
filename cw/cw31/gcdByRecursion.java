package cw31;

public class gcdByRecursion {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(gcd(35, 315));
    }
}