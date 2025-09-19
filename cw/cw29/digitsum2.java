package cw29;

public class digitsum2 {
    public static int digitSum(int n) {
          int count=0;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(50300));
        System.out.println(digitSum3(3));
    }

    public static int digitSum3(int n) {
        int sum = 0;
        if (n == 0) {
            return sum;
        }
        return sum += (n % 10) + digitSum3(n / 10);
        // return sum;
    }
}
 