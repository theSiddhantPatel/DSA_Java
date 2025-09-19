package cw31;

public class gcd2 {
    static int gcd(int a, int b) {
        int rem = 0;
        while (a%b != 0) {
            rem = a % b;
            a = b;
            b = rem;

        }
        return b;
    }

    public static void main(String[] args) {
        int num1 = 15, num2 = 25;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}
