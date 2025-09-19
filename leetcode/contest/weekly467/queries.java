package contest.weekly467;

import java.util.*;

public class queries {
    public static int earliestTime(int[][] tasks) {
        int min = 201;
        for (int i = 0; i < tasks.length; i++) {
            int time = tasks[i][0] + tasks[i][1];
            min = Math.min(min, time);
        }
        return min;
    }

    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = n - 1; i >= 0 && list.size() < k; i--) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                list.add(nums[i]);
            }
        }
        int[] res = new int[list.size()];
        {
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
        }
        return res;
    }

    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int n = nums.length;
        boolean[] arr = new boolean[n];
        if (n >= k) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = true;
            }
            return arr;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= k; j++) {
                if (nums[j] > k)
                    nums[j] = k;
                else
                    sum += k;
                if (sum == k) {
                    arr[i] = true;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int tasks[][] = { { 1, 6 }, { 2, 3 }, { 1, 2 } };
        System.out.println(earliestTime(tasks));
    }
}
