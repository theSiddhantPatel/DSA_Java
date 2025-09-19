package striverDsaNotion.array;

//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?
public class MaxSumSubarrayofsizeK {
    public int maximumSumSubarray(int[] nums, int k) {
        // Code here
        // public int maxSumSubarrayOfSizeK(int[] nums, int k) {
        int n = nums.length;
        if (n < k)
            return -1; // edge case

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        int l = 0; // l means i-k;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[l];
            maxSum = Math.max(maxSum, windowSum);
            l++;
        }

        return maxSum;
    }
}
