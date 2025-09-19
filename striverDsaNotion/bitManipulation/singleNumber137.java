package striverDsaNotion.bitManipulation;

public class singleNumber137 {
    public int singleNumber(int[] nums) {

        /*
         * kth bit of a number is zero or not?
         * formula: if(num & (1<<k)==0) means num's kth bit is zero
         */
        int result = 0;
        for (int k = 0; k < 32; k++) {
            int count1 = 0;
            for (int num : nums) {
                if ((num & (1 << k)) != 0)
                    count1++;
            }
            if (count1 % 3 == 1)
                result = result | 1 << k;
        }
        return result;
    }
}
