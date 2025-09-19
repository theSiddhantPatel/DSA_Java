import java.util.Scanner;

public class factoriseNM {
    // after minimum adding 7 in any prime number, can't exist as a prime number(for 2 digits)....?
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                @SuppressWarnings("unused")
                int n = s.nextInt();
                System.out.println(7);
            }
        }
    }
}
