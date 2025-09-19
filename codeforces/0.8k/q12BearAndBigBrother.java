import java.util.Scanner;

public class q12BearAndBigBrother {
    // https://codeforces.com/problemset/problem/791/A
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int i = 1, j = 1, count = 0;    
        while (a * i <= b * j) {
            i *= 3;
            j *= 2;
            count++;
        }
        System.out.println(count);
        s.close();
    }
}
