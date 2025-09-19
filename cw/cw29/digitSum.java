package cw29;

public class digitSum {
    public static void digSum(int n) {
        int rem = 0;
        while (n > 0) {
            rem += n % 10;
            n /= 10;
            // rem++;
        }
        System.out.println(rem);

    }

    public static void main(String[] args) {
        digSum(350);
    }
}
