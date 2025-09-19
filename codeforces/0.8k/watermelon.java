import java.util.Scanner;

@SuppressWarnings("resource")
public class watermelon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x < 4) {
            System.out.println("no");
        }
        else
        System.out.println(x % 2 == 0 ? "yes" : "no");
    }

}