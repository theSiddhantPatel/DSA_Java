package dsquestions.array;

import java.util.HashMap;
import java.util.Map;

public class twoSumq1 {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] {};
    }

    public int[] twoSumTwoPass(int[] nums, int target) {
        /**
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         */
        Map<Integer, Integer> numMap = new HashMap<>();
        // First pass: store all numbers with their indices
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        // Second pass: find complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[] { i, numMap.get(complement) };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        twoSumq1 x = new twoSumq1();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i : x.twoSum(arr, 8)) {
            System.out.print(i + " ");
        }

    }
}
