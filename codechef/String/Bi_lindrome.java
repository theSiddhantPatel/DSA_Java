package String;

import java.util.*;
import java.lang.*;
import java.io.*;

//https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/QTOO_2523
public class Bi_lindrome {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String str = s.next();
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                        break; // break closes all iterations at a time
                    }
                }
                if (count > 0)
                    break; // if count==1 no any for loop will run (to optimize code, break halts the loop
                           // completely, but 'continue' skips only one iteration.)
            }
            System.out.println(count > 0 ? n - 2 : -1);
        }

    }
}
