import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freqMap = new HashMap<>();

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                freqMap.put(a[j], freqMap.getOrDefault(a[j], 0) + 1);
            }

            int bestLen = 0;

            for (int groupSize = 1; groupSize <= n; groupSize++) {
                int ec = 0;
                for (int count : freqMap.values()) {
                    if (count >= groupSize) {
                        ec++;
                    }
                }
                bestLen = Math.max(bestLen, groupSize * ec);
            }

            System.out.println(bestLen);
        }
    }
}
