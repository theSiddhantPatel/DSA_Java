import java.util.Scanner;

public class AirlineRestrictions {
    public static void main(String[] args) {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int e = s.nextInt();
            int f = a + b;
            int g = b + c;
            int h = a + c;
            if (f <= d && c <= e)
                System.out.println("YES");
            else if (g <= d && a <= e)
                System.out.println("YES");
            else if (h <= d && b <= e)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
