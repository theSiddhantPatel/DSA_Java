import java.util.Scanner;

public class coverInWater {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String str = s.next();
            if (str.contains("...")) {
                System.out.println(2);
                continue;
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '.') {
                    count++;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}
