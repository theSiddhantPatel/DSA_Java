import java.util.Scanner;

public class ShiftingStacks3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            if (n == 1) {
                System.out.println("YES");
                continue;
            }

            boolean ok = false;
            long have = a[0];
            a[0] = 0;

            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    have += a[i] - (a[i - 1] + 1);
                    a[i] = a[i - 1] + 1;
                } else if (a[i - 1] == a[i]) {
                    if (have > 0) {
                        a[i]++;
                        have--;
                    }
                } else {
                    long gap = a[i - 1] - a[i] + 1;
                    if (gap <= have) {
                        a[i] += gap;
                        have -= gap;
                    }
                }
            }

            ok = true;
            for (int i = 1; i < n; i++) {
                if (a[i] <= a[i - 1]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
