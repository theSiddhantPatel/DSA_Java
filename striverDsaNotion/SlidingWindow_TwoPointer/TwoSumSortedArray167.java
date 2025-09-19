package striverDsaNotion.SlidingWindow_TwoPointer;

import java.util.Arrays;

public class TwoSumSortedArray167 {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] { i + 1, j + 1 };
                /*
                 * return new int[]{i + 1, j + 1};
                 * This creates a new integer array with exactly two elements:
                 * First element: i + 1
                 * Second element: j + 1
                 * In LeetCode 167, the problem wants 1-based indices (indexing starts at 1, not
                 * 0).
                 * So if i = 0 and j = 2, instead of returning {0, 2}, we return {1, 3}.
                 */
            } else {
                if (numbers[i] + numbers[j] > target) {
                    j--;
                } else
                    i++;
            }
        }
        return new int[] {};
        /*
         * return new int[]{};
         * This creates an empty integer array (length 0).
         * It’s used as a “no result” indicator if no valid pair is found.
         * Example:
         * return new int[]{}; // returns []
         */
    }

    public static void main(String[] args) {
        TwoSumSortedArray167 x = new TwoSumSortedArray167();
        // int[] arr = { 1, 2, 3 };
        // System.out.println(x.twoSum(arr, 4));//or
        int[] result = new int[] {};
        Arrays.toString(result); // print nicely

        System.out.println(result);
    }

}
