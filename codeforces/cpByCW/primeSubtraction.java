
import java.util.Scanner;

public class primeSubtraction {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int t = s.nextInt();
            while (t-- > 0) {
                long x = s.nextLong();
                long y = s.nextLong();
                if (x - y < 2) {
                    System.out.println("NO");
                } else
                    System.out.println("yes");
            }
        }
    }
}
//-siddhant patel
