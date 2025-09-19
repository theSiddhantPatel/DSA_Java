package codeforces.contest;

//https:// codeforces.com/contest/2044/submit
import java.util.Scanner;

public class Normal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();
            int n = str.length();
            StringBuilder sb = new StringBuilder();
            while (n-- > 0) {
                switch (str.charAt(n)) {
                    case 'p' -> sb.append('q');
                    case 'q' -> sb.append('p');
                    default -> sb.append('w');
                }
            }
            System.out.println(sb.toString());
        }
    }
}
