
import java.util.Scanner;

public class prefixSumPrimes {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int ones = 0, twos = 0;
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                if (x == 1)
                    ones++;
                else
                    twos++;
            }   if (ones == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(2 + " ");
                }
            } else if (twos == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(1 + " ");
                }
            } else {
                System.out.print("2 1 ");
                int y = n - ones - 1;
                for (int i = 0; i < y; i++) {
                    System.out.print(2 + " ");
                }
                for (int i = 0; i < n - y - 2; i++) {
                    System.out.print(1 + " ");
                }
            }
        }
    }
}
