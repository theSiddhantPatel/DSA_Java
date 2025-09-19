package cw29;

public class digSum {
    public static int dc(int n) {

        int sum = 0;
        if (n != 0)// base case
        {
            // count++;
            sum = dc(n / 10) + n % 10;// recursive work+self work
        }
        return (sum);
    }

    public static void main(String[] args) {
        System.out.println(dc(101));
    }
}