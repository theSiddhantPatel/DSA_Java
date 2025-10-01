import java.util.HashMap;
import java.util.Map;

public class maxFreq3005 {
    public int maxFrequencyElements(int[] nums) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (int num : nums) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);
            maxFreq = Math.max(maxFreq, count); // track maximum frequency
        }

        // Step 2: Sum up all occurrences of numbers with maxFreq
        int result = 0;
        for (int f : freq.values()) {
            if (f == maxFreq) {
                result += f;
            }
        }

        return result;

    }
}