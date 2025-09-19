import java.util.Scanner;
//https://codeforces.com/problemset/problem/977/A
public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0)
                n = n / 10;
            else
                n = n - 1;
        }
        System.out.println(n);
        s.close();
    }
}
