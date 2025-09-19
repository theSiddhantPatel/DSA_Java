package cw30;

public class alternateSum {
    public static int seriesSum(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            return seriesSum(n - 1) - n;

        } 
        return seriesSum(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}

// static int count = 0;

// public static int sum(int n) {
// for (int i = 1; i <= n; i++) {
// if (i % 2 == 0) {
// return count -= i;
// }
// return count += i;
// }
// return count;
// }

// public static void main(String[] args) {
// System.out.println(sum(10));
// }
// }
