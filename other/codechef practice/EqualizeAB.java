import java.util.*;
import java.lang.*;
import java.io.*;

class EqualizeAB {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int x = s.nextInt();
            System.out.println((a - b) % (2 * x) == 0 ? "Yes" : "no");
        }

    }
}

// C:\Users\spatel\OneDrive\Pictures\Screenshots 1\Screenshot (132).png


