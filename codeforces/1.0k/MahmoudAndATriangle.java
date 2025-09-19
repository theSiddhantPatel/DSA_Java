import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("resource")
public class MahmoudAndATriangle {
    // https://codeforces.com/problemset/problem/766/B
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}