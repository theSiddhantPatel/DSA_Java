import java.util.Scanner;

//https://codeforces.com/problemset/problem/479/A
public class Expression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = Math.max(a + b + c, a * b * c);
        max = Math.max(max, (a + b) * c);
        // max = Math.max(max, (a + c) * b);
        max = Math.max(max, (b + c) * a);
        System.out.println(max);
        s.close();
    }
}
