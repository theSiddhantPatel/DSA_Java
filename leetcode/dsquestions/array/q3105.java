package array;
//3105. Longest Strictly Increasing or Strictly Decreasing Subarray

public class q3105 {
    public int longestMonotonicSubarray(int[] nums) {
        int inCount = 1, deCount = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                inCount++;
                deCount = 1;
            } else if (nums[i] > nums[i + 1]) {
                deCount++;
                inCount = 1;
            } else {
                inCount = 1;
                deCount = 1;
            }
            max = Math.max(max, Math.max(inCount, deCount));
            /*
             * we also compare (max) with inCount and deCount, bcz if any element is
             * repeated in array else part of the code would it will reset max to 1,
             * if we write max=Math.max(inCount, deCount).
             * this is a problem so be also compare max eachtime.
             */
        }
        return max;
    }
}
