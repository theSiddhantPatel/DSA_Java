
import java.util.*;
// import java.lang.*;
// import java.io.*;

public class TheAttackOfQueen {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int sum = 2 * (n - 1);
            sum += Math.min(x - 1, y - 1) + Math.min(x - 1, n - y) + Math.min(n - x, y - 1) + Math.min(n - x, n - y);
            // sum+=2*Math.min(n-x,n-y)+2*Math.max(n-x,n-y);
            System.out.println(sum);
            s.close();
        }
    }
}
