package cw34;

public class digitPalindrome {
    public static boolean numberPalindrome(int n) {
        int orgNum = n, rem = 0;
        while (n != 0) {
            rem = rem * 10 + (n % 10);
            n /= 10;
        }
        if (rem == orgNum)
            return true;
        return false;

    }

    public static void main(String[] args) {
System.out.println(numberPalindrome(505));
    }

}
