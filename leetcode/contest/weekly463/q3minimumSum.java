package contest.weekly463;

public class q3minimumSum {
    // public long minArraySum(int[] nums, int k) {
    // int n = nums.length;
    // long sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum += nums[i];
    // if (sum % k == 0)
    // sum = 0;
    // }
    // return sum;

    public long minArraySum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int i = 0;
        for (int j = 0; j < n; j++) {
            for (i = j; i < n; i++) {
                sum2 += nums[i];
                if (sum2 % k == 0) {
                    sum = sum - sum2;
                    sum2 = 0;
                }
            }
            j = i + 1;
            sum2 = 0;
        }

        return sum;

    }

    public static void main(String[] args) {
        q3minimumSum x = new q3minimumSum();
        int[] nums = { 1, 1, 1 };
        System.out.println(x.minArraySum(nums, 2));
    }
}
