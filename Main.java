import java.util.*;

public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int pos = 1; pos < size; pos++) {
            if (arr[pos - 1] > arr[pos]) {
                System.out.println(pos + " " + (pos + 1));
                return;
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) {
        solve();
    }
}
