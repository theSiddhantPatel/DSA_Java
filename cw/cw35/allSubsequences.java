package cw35;

// import java.util.*;
// import java.lang.*;

public class allSubsequences {
    public static void subsequences(String s) {
        char curr = s.charAt(0);
        int i = 1;
        String x;
        while (i <= s.length()) {
            x = s.substring(i);

            System.out.print(x + " ");
            System.out.print(curr + x + " ");

            i++;
        }
    }

    public static void main(String[] args) {
        subsequences("siddhant");
    }
}
