package striverDsaNotion.array;

public class minumumSizeSubArraySum209 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, sum = 0, minLen = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (j < n) {
            sum += nums[j];
            while (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }  
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        minumumSizeSubArraySum209 x = new minumumSizeSubArraySum209();
        int[] nums = { 2, 3, 10, 2, 4, 3 };
        System.out.println(x.minSubArrayLen(1, nums));

    }
}
