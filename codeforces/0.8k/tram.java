import java.util.Scanner;
///https://codeforces.com/problemset/problem/116/A
public class tram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0,current=0;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            current+=b-a;
            max = Math.max(max, current);
        }
        System.out.println(max);
        s.close();
    }
}
