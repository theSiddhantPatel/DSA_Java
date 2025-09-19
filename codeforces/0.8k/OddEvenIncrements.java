import java.util.Scanner;

public class OddEvenIncrements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < n; i += 2) {
                if (a[i] % 2 != a[0] % 2) {
                    flag = false;
                    break;
                }
            }
            for (int i = 1; i < n; i += 2) {
                if (a[i] % 2 != a[1] % 2) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "yes" : "NO");
        }
        s.close();
    }
}
