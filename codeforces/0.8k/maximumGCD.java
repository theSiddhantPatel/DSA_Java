import java.util.Scanner;
//https://codeforces.com/problemset/problem/1370/A
public class maximumGCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            System.out.println(n / 2);
        }
        s.close();
    }
}
