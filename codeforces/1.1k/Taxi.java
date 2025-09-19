import java.util.HashMap;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/158/B
public class Taxi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        count += map.getOrDefault(4, 0);
        int two = map.getOrDefault(2, 0);
        int three = map.getOrDefault(3, 0);
        int one = map.getOrDefault(1, 0);

        count += three;
        one = Math.max(0, one - three);
        count += two / 2;
        two %= 2;
        if (two > 0) {
            count++;
            one = Math.max(0, one - 2);
        }
        count += (one + 3) / 4; // Equivalent to Math.ceil(one / 4.0)
        System.out.println(count);
        s.close();
    }
}
