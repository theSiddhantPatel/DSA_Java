package math;

import java.util.*;
import java.lang.*;
import java.io.*;

//https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/MAX_DIFF?tab=statement
public class the2dishes {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int S = s.nextInt();
            if (S <= n) {
                System.out.println(S);
                continue;
            } else {
                System.out.println(2 * n - S);
                // n-(s-n)=2*n-S, bcz S<n so first value=n and second value should be =n-S,
                // for max difference
                continue;
            }
        }

    }
}
