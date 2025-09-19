package contest.byw165;

import java.util.HashMap;
// import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ok {
    public static int smallestAbsent(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            sum += num;
            set.add(num);
        }

        double avg = (double) sum / n;
        int candidate = (int) Math.floor(avg) + 1;

        while (set.contains(candidate) || candidate <= 0) {
            candidate++;
        }

        return candidate;
    }

    public static int countWindows(int[] nums, int k, int m) {
        int n = nums.length;
        if (k > n)
            return 0;

        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        // first window
        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        if (exceedsM(freq, m))
            count++;

        // slide window
        for (int i = k; i < n; i++) {
            // remove outgoing
            int out = nums[i - k];
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0)
                freq.remove(out);

            // add incoming
            int in = nums[i];
            freq.put(in, freq.getOrDefault(in, 0) + 1);

            if (exceedsM(freq, m))
                count++;
        }

        return count;
    }

    private static boolean exceedsM(Map<Integer, Integer> freq, int m) {
        for (int f : freq.values()) {
            if (f > m)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4 };
        // System.out.println(smallestAbsent(arr));
        System.out.println(countWindows(arr, 3, 2));
    }
}