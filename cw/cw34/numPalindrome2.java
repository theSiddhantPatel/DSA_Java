package cw34;

//  Int n and no. of digits are taken as input. 
public class numPalindrome2 {
    static int reverse(int n, int d) {
        if (n == 0 || d == 0)  //you can write only one condition
            return n;
        return n % 10 * (int) Math.pow(10, d - 1) + reverse(n / 10, d - 1);  //math.pow typecasting
    }

    public static void main(String[] args) {
        int n = 110110;

        if (reverse(n, 5) == n)
            System.out.println("PALINDROME ");
        else
            System.out.println("Not Palindrome");

    }

}