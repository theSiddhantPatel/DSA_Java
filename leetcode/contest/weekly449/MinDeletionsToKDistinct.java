// package Java DSA.LC.contest;

import java.util.*;


public class MinDeletionsToKDistinct {
    public static int minDeletions(String s, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int distinctChars = freqMap.size();
        if (distinctChars <= k) {
            return 0;
        }

        // Get frequencies and sort them
        List<Integer> frequencies = new ArrayList<>(freqMap.values());
        Collections.sort(frequencies);

        int deletions = 0;
        int toRemove = distinctChars - k;
        for (int i = 0; i < toRemove; i++) {
            deletions += frequencies.get(i);
        }

        return deletions;
    }

    public static void main(String[] args) {
        System.out.println(minDeletions("abc", 2)); // Output: 1
        System.out.println(minDeletions("aabb", 2)); // Output: 0
        System.out.println(minDeletions("yyyzzaabsdfaa", 1)); // Output: 2
    }
}
