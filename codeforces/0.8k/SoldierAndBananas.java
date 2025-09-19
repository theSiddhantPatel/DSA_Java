import java.util.Scanner;
//https://codeforces.com/problemset/problem/546/A
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        int w = s.nextInt();
        System.out.println(k * w * (w + 1) / 2 - n < 0 ? 0 : k * w * (w + 1) / 2 - n);
        s.close();
    }
}
