import java.util.*;
import java.lang.*;
import java.io.*;

public class makeMoney {
    // https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/MAKEMONEY?tab=statement

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int x = s.nextInt(); // max coin in each bag
            int c = s.nextInt();
            // int []arr=new int [n];
            int sum = 0, count = 0;
            for (int i = 0; i < n; i++) {
                int j = s.nextInt();
                if (j < x - c) {
                    sum += x;
                    count += c;
                } else
                    sum += j;
            }
            System.out.println(sum - count);
        }

    }
}