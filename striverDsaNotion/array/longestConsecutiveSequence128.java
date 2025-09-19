
package striverDsaNotion.array;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence128 {
    public static int lcs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int maxLen = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int currNum = i;
                int currLen = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }

    // another method
    public static int lcs2(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        Arrays.sort(nums);

        int maxCount = 1;
        int count = 1;
        for (int i : nums) {
            if (nums[i - 1] == nums[i])
                continue;
            // If the current element is equal to the previous one (duplicate), skip it.
            if (nums[i - 1] + 1 == nums[i])
                count++;
            else
                maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

}
