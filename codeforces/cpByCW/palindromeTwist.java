import java.util.Scanner;

public class palindromeTwist {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            String str = s.next();
            int i = 0, j = n - 1;
            while (i < j) {
                int diff = Math.abs(str.charAt(i) - str.charAt(j));
                if (diff - 2 == 0 || diff == 0) {
                    i++;
                    j--;
                } else {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
    }
}
