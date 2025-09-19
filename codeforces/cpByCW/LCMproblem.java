import java.util.Scanner;

public class LCMproblem {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int t = s.nextInt();
            while (t-- > 0) {
                long l = s.nextInt();
                long r = s.nextInt();
                long x = l;
                long y = l * 2;
                if (y <= r) {
                    System.out.println(x + " " + y);
                } else {
                    System.out.println(-1 + " " + -1);
                }
            }
        }
    }
}
