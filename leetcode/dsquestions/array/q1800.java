package array;

//1800. Maximum Ascending Subarray Sum
//https://chat.deepseek.com/a/chat/s/ed77f8c6-d663-4cb8-9c24-0641fc0230dd
public class q1800 {

    public int maxAscendingSum(int[] nums) {
        if (nums.length == 0)
            return 0; // Edge case: empty array

        int sum = nums[0]; // Initialize sum with the first element
        int max = nums[0]; // Initialize max with the first element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i]; // Add to the current ascending subarray sum
            } else {
                sum = nums[i]; // Reset sum to the current element
            }
            max = Math.max(max, sum); // Update max if the current sum is greater
        }

        return max;
    }
}
