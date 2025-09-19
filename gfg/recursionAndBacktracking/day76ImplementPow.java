package recursionAndBacktracking;

//https://www.geeksforgeeks.org/problems/powx-n/1
public class day76ImplementPow {

    static double power(double b, int e) {
        // code here
        if (e == 0)
            return 1;
        if (e == 1)
            return b;
        if (e < 0)
            return 1 / (power(b, -e));
        double powHalf = power(b, e / 2);
        if (e % 2 == 0)
            return powHalf * powHalf;
        else
            return b * powHalf * powHalf;
    }

    public static void main(String[] args) {
        System.out.println(power(5, 2));
    }
}
