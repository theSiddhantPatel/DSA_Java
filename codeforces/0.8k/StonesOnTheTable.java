import java.util.Scanner;
//https://codeforces.com/problemset/problem/266/A
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String str = s.next();
        int count = 0;
        if (t == 1)
            System.out.println(0);
        else {
            for (int i = 1; i < t; i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}
