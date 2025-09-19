import java.util.Scanner;

@SuppressWarnings("resource")
public class WayLongToWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();
            if (str.length() > 10) {
                System.out.print(str.charAt(0));
                System.out.print(str.length() - 2);
                System.out.println(str.charAt(str.length() - 1));
            } else
                System.out.println(str);
        }
    }
}
