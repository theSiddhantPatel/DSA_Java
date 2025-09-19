package striverDsaNotion.array;

import java.util.ArrayList;
import java.util.List;

public class majorityElement229 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Integer majEl1 = null, majEl2 = null;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (majEl1 != null && nums[i] == majEl1) {
                // majEl1 != null this check is used for removeing null pointer exception
                count1++;
            } else if (majEl2 != null && nums[i] == majEl2) {
                count2++;
            } else if (count1 == 0) {
                majEl1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                majEl2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }

        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == majEl1) {
                count1++;
            } else if (num == majEl2) {
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3)
            result.add(majEl1);
        if (count2 > n / 3 && !majEl2.equals(majEl1))
            result.add(majEl2);
        return result;
    }

}
