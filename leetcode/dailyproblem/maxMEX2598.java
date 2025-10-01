//https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/

import java.util.HashSet;
// import java.util.Set;

public class maxMEX2598 {
    public int findSmallestInteger(int[] nums, int value) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(Math.abs(nums[i]) % value);
        }

        for (int i = 0; i < n; i++) {
            if (!set.contains(i))
                return i;
        }
        return 0;

    }

    public static void main(String[] args) {
        maxMEX2598 x = new maxMEX2598();
        int[] arr = { 1, -10, 7, 13, 6, 8 };
        System.out.println(x.findSmallestInteger(arr, 7));

    }
}
