import java.util.Scanner;

@SuppressWarnings("resource")
public class team {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        while (t-- > 0) {
            String str = s.next();
            if (str.contains("++")) {
            count++;
            } else
            count--;
            // System.out.println(str.contains("++") ? count++ : count--);
        }
        System.out.println(count);
    }
}
