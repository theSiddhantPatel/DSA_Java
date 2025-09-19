package striverDsaNotion.array;

public class slidingWindowMaximum239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // brute force approach
        int n = nums.length;
        // if (n == 0 || k == 0)
        //     return new int[0];

        int[] max = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int windowMax = nums[i];
            for (int j = i; j < i + k; j++) {
                windowMax = Math.max(windowMax, nums[j]);
            }
            max[i] = windowMax;
        }
        return max;
    }


    // optimized  :- youtube: codestorywithMIK
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0)
            return new int[0];

        int[] max = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int windowMax = nums[i];
            for (int j = i; j < i + k; j++) {
                windowMax = Math.max(windowMax, nums[j]);
            }
            max[i] = windowMax;
        }

        return max;
    }

}
