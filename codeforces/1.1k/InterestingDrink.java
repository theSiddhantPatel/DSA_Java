import java.util.Scanner;

//https://codeforces.com/problemset/problem/706/B
public class InterestingDrink {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = s.nextInt();
        }
        int q = s.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = s.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int count = 0;
            while (count < n && m[i] >= x[count]) {
                count++;
            }
            System.out.println(count);
        }
        s.close();
    }
}
