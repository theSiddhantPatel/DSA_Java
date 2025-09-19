package cw29;

public class power {
    public static int powerFind(int n, int m) {
        if (m == 0 || n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n * powerFind(n, m - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerFind(1, 5));
    }
}
