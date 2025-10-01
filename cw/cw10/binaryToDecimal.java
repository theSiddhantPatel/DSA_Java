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

    public static int binToDecimal(int n) {
        int ans = 0;
        int i = 0;
        while (n > 0) {
            int bit = n % 10;
            ans += bit * Math.pow(2, i);
            i++;
            n = n / 10;
        }
        return ans;

    }

    public static int decToBinary(int n) {
        int binary = 0;
        int base = 1; // Represents 10^0, 10^1, 10^2, etc.

        while (n > 0) {
            int remainder = n % 2;
            binary = binary + remainder * base;
            base = base * 10;
            n = n / 2;
        }
        return binary;

    }

    public static void main(String[] args) {
        System.out.println(decToBinary(128));
        // System.out.println(binaryToDecimal(10011));
    }
}