package striverDsaNotion.SlidingWindow_TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int n1 = nums[i];
            int target = -n1;
            twoSum(nums, target, i + 1, n - 1, res);
        }
        return res;

    }

    public void twoSum(int[] nums, int target, int i, int j, List<List<Integer>> res) {
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                while (i < j && nums[i] == nums[i + 1])
                    i++;
                while (i < j && nums[j] == nums[j - 1])
                    j--;
                res.add(Arrays.asList(-target, nums[i], nums[j]));
                i++;
                j--;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else
                i++;
        }

    }

    public static void main(String[] args) {
        ThreeSum15 x = new ThreeSum15();
        int arr[] = { 0, 1, -1, 2, 0, -2, 3, 1, 4, -5, -3, 2, 1 };
        System.out.println(x.threeSum(arr));
    }

}