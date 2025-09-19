package slidingW_2Pointer;

import java.util.Arrays;

public class quadruplets1995 {
    public int countQuadruplets(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = n - 1;
        int count = 0;
        for (int i = 0; i + 2 < n; i++) {
            while (i + 2 < j) {
                if (nums[i] + nums[i + 1] + nums[i + 2] == nums[j]) {
                    count++;
                    j--;
                } else if (nums[i] + nums[i + 1] + nums[i + 2] < nums[j])
                    j--;
                else
                    i++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        quadruplets1995 x = new quadruplets1995();
        int[] nums = { 1, 1, 1, 3, 5 };
        System.out.println(x.countQuadruplets(nums));
    }
}
