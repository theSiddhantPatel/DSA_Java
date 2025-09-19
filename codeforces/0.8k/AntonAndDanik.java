import java.util.Scanner;

//https://codeforces.com/problemset/problem/734/A
public class AntonAndDanik {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt(), a = 0, d = 0;
            String str = s.next();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'A') {
                    a++;
                } else
                    d++;

            }   if (a > d) {
                System.out.println("Anton");
            } else if (d > a) {
                System.out.println("Danik");
            } else
                System.out.println("Friendship");
        }
    }
}
