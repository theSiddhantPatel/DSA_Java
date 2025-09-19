package contest;

//https://www.codechef.com/START204D/problems/MINSMODM
import java.util.*;

public class minimizeSum {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(); // size of array
            int m = s.nextInt(); // modulo value
            int[] freq = new int[m]; // freq should be size m
            int[] A = new int[n]; // array size is n
            long sum = 0;

            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
                freq[A[i]]++;
                sum += A[i];
            }

            long minSum = sum;
            long currSum = sum;

            // simulate all shifts
            for (int shift = 1; shift < m; shift++) {
                currSum += n; // all elements increase by 1
                int wrapCount = freq[m - shift]; // those that wrap around
                currSum -= (long) m * wrapCount;
                minSum = Math.min(minSum, currSum);
            }

            System.out.println(minSum);
        }
    }
}
