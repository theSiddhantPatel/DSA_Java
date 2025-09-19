package striverDsaNotion.bitManipulation;

import java.util.HashSet;
import java.util.Set;

public class singleNumber136 {
    // using xor properties x^x=0; diff: 1 same:0
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

    // using set
    public int singleNumber2(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i]))
                seen.remove(nums[i]);
            else
                seen.add(nums[i]);

        }
        return seen.iterator().next();

    }
}
