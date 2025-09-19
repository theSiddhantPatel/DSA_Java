import java.util.*;

public class d572 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            if (Math.max(c, d) >= Math.max(a, b))
                System.out.println("POSSIBLE");
            else
                System.out.println("imPOSSIBLE");
            s.close();
            ;
        }
    }
}
