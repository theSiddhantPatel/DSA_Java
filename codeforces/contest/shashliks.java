import java.util.Scanner;

public class shashliks {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int t = s.nextInt();
            while (t-- > 0) {
                int k = s.nextInt();
                int a = s.nextInt();
                int b = s.nextInt();
                int x = s.nextInt();
                int y = s.nextInt();
                int total = 0;
                if (y < x) {
                    total += (k - b + y) / y;
                    k=b-y;
                }

            }
        }
    }
}
