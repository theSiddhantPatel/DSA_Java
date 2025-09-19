
import java.util.*;

@SuppressWarnings("resource")
// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/DIGSMPAR
public class DigitSumParities {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = n;
            int digSum = 0;
            while (n > 0) {
                digSum += n % 10;
                n /= 10;
            }
            n = m + 1;
            int digSum2 = 0;
            while (n > 0) {
                digSum2 += n % 10;
                n /= 10;
            }
            System.out.println(digSum % 2 == 0 && digSum2 % 2 == 0 ? m + 2 : m + 1);
        }
    }
}
