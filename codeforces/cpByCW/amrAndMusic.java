import java.util.*;

public class amrAndMusic {
    public static void main(String[] args) {
        int n;
        int k;
        long[] arr;
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            k = s.nextInt();
            arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextLong();
            }
        }
        // Store value and original index (1-based)
        List<Pair> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(new Pair(arr[i], i + 1));
        }

        // Sort- based on value
        Collections.sort(v);

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (v.get(i).value <= k) {
                indices.add(v.get(i).index);
                k -= v.get(i).value;
            } else {
                break;
            }
        }

        System.out.println(indices.size());
        for (int idx : indices) {
            System.out.print(idx + " ");
        }
        System.out.println();
    }

    // Helper class to store value and index
    static class Pair implements Comparable<Pair> {
        long value;
        int index;

        Pair(long value, int index) {
            this.value = value;
            this.index = index;
        }

        // Sort by value
        @Override
        public int compareTo(Pair other) {
            return Long.compare(this.value, other.value);
        }
    }
}
