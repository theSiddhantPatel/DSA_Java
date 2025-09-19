import java.util.*;
import java.lang.*;
import java.io.*;

@SuppressWarnings({ "resource", "unused" })
class Codechef1 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            float a = s.nextInt();
            int x = s.nextInt();
            int b = s.nextInt();
            float y = s.nextInt();
            if ((float) (a / x) == (float) (b / y))
                System.out.println("equal");
            else
                System.out.println((float) (a / x) > (float) (b / y) ? "Alice" : "Bob");
        }

    }
}
