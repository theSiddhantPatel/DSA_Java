import java.util.Scanner;

public class primeDeletion {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int t = s.nextInt();
            while (t-- > 0) {
                String str = s.next();
                switch (str.charAt(0)) {
                    case '1' -> System.out.println(13);
                    case '2' -> System.out.println(23);
                    case '3' -> System.out.println(31);
                    case '4' -> System.out.println(47);
                    case '5' -> System.out.println(53);
                    case '6' -> System.out.println(61);
                    case '7' -> System.out.println(73);
                    case '8' -> System.out.println(83);
                    default -> System.out.println(97);
                }
            }
        }
    }
}
