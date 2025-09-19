import java.util.*;
import java.lang.*;
import java.io.*;

class c {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();
            String str2 = "ADVITIYA";
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str2.charAt(i)) {
                    sum +=Math.abs( str2.charAt(i) - str.charAt(i));
                }
            }
            System.out.println(sum);
        }

    }
}
