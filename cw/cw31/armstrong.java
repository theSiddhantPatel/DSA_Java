package cw31;

public class armstrong {
    public static int isArmstrong(int num) {
        int originalNum = num;
        int n = (int) (Math.log10(num) + 1);
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        return sum == originalNum? 1 : 0;
    }
    public static void main(String[] args) {
        int num = 150;
        System.out.println(isArmstrong(num) == 1? "Armstrong number" : "Not an Armstrong number");
    }
}
