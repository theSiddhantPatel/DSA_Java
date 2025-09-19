import java.util.Scanner;

//https://codeforces.com/problemset/problem/110/A
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int count = 0;
            long n = s.nextLong();
            while (n > 0) {
                if (n % 10 == 4 || n % 10 == 7)
                    count++;
                n /= 10;
            }
            System.out.println(count == 4 || count == 7 ? "YES" : "NO");
        }
    }
}
