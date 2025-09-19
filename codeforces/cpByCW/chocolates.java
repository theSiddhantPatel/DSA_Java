import java.util.Scanner;

public class chocolates {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            long ans = arr[n - 1];
            int nextCompare = arr[n - 1] - 1;
            for (int i = n - 2; i >= 0; i--) {
                ans += Math.min(nextCompare, arr[i]);
                nextCompare = Math.min(nextCompare, arr[i]) - 1;
                if (nextCompare <= 0)
                    break;
            }
            System.out.println(ans);
        }
    }
}
 