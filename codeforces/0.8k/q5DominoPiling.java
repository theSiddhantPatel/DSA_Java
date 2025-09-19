import java.util.Scanner;

@SuppressWarnings("resource")
public class q5DominoPiling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(m * n / 2);
    }
}
