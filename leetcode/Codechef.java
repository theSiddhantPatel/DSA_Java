import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String target = "ADVITIYA";
        int T = s.nextInt();
        s.nextLine(); // Consume newline

        while (T-- > 0) {
            String input = s.nextLine();
            int sum = 0;

            for (int i = 0; i < 8; i++) {
                int current = input.charAt(i) - 'A';
                int t = target.charAt(i) - 'A';
                int diff = (t - current) % 26;
                sum += (diff < 0) ? diff + 26 : diff;
            }
            System.out.println(sum);
        }
    }
}
