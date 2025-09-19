package cw30;

public class printN {
    public static int printUptoN(int n) {
        int total = 0;
        if (n == 0) {

            return 0;
        }
        printUptoN(n - 1);
        if (n % 2 == 0) {
            total -= n;
        }
        total += n;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(printUptoN(10));
    }
}