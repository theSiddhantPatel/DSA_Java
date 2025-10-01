package contest.biweekly166;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q1 {
    public static String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        Map<Integer, List<Character>> group = new HashMap<>();
        int maxSize = 0;
        int bestK = 0;

        for (char c : freq.keySet()) {
            int k = freq.get(c);

            if (!group.containsKey(k)) {
                group.put(k, new ArrayList<>());
            }
            group.get(k).add(c);

            int size = group.get(k).size();
            if (size > maxSize || (size == maxSize && k > bestK)) {
                maxSize = size;
                bestK = k;
            }
        }

        StringBuilder res = new StringBuilder();
        for (char c : group.get(bestK)) {
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(majorityFrequencyGroup("abcd"));
    }

}