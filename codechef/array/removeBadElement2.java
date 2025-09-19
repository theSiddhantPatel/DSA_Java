package array;

import java.util.*;
import java.lang.*;
import java.io.*;

public class removeBadElement2 {
    // problem tle  ☼ self

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            int max = 0;
            int count = 1;
            boolean flag = false;
            for (int i = 0; i < n - 1; i++) {

                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        max = Math.max(max, count);
                    }

                }
                if (count > 1)
                    flag = true;
                count = 1;

            }
            System.out.println(flag ? n - max : n - max - 1);
        }

    }
}