package cw10;

public class binaryToDecimal {
    // public static void main(String[] args) {
    // int n = 10, rem = 0;
    // while (n > 0) {
    // rem = n % 2;
    // n /= 2;
    // System.out.print(rem);
    // rem = 0;
    // }
    // }

    public static int btd(int n) {
        int rem = 0;
        while (n > 0) {
            rem = n % 2;
            btd(n /= 2);
        }
        return (rem);

    }
    public static void main(String[] args) {
        // btd(10);
        System.out.println(btd(10));
    }
}