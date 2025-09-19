package striverDsaNotion.Recursion_Backtracking;

import java.util.*;

public class subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int total = 1 << n; // 2^n

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }

    public static void main(String[] args) {
        subsets78 x = new subsets78();
        int[] arr = { 1, 2, 3 };
        System.out.println(x.subsets(arr));
    }

}
999