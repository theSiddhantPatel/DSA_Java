package striverDsaNotion.SlidingWindow_TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // skip duplicate i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue; // skip duplicate j

                int p = j + 1, q = n - 1;
                while (p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        // skip duplicates for p
                        while (p < q && nums[p] == nums[p - 1])
                            p++;
                        // skip duplicates for q
                        while (p < q && nums[q] == nums[q + 1])
                            q--;
                    }
                }
            }
        }
        return res;
    }
}
