package cw31;

public class gcdByDivisionMethod {
    public static int gcd(int n, int m) {
        int rem = 0;
        while (n % m != 0) {
            rem = n % m;
            n = m;
            m = rem;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(gcd(120, 24));
    }
}
