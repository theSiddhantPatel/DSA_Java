package striverDsaNotion.SlidingWindow_TwoPointer;

public class subArraySum560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    // next approach : using prefix sum
    public int subarraySum2(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            if (prefixSum[i] - nums[j] == 0)
                count++;
        }

    }

    public static void main(String[] args) {
        subArraySum560 x = new subArraySum560();
        int[] nums = { 0, 1, -1 };
        System.out.println(x.subarraySum(nums, 0));
    }
}
