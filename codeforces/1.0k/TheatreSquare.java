import java.util.Scanner;

public class TheatreSquare {
    // https://codeforces.com/problemset/problem/1/A
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long m = s.nextLong();
        long n = s.nextLong();
        long a = s.nextLong();
        // ceil(n/a)=(n+a−1)/a
        System.out.println((long)(Math.ceil(1.0*m/a)*Math.ceil(1.0*n/a)));
        s.close();
    }
}