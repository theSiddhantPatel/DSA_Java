package striverDsaNotion.array;

public class moveZeroes283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }

        }
        for (int i = j; i < n; i++) {
            nums[i] = 0;
        }

    }
    // another approach

    public void moveZeroes2(int[] nums) { // S.C.=0;
        int index = 0;
        for (int num : nums)
            if (num != 0)
                nums[index++] = num;
        while (index < nums.length)
            nums[index++] = 0;
        System.gc();// garbage collector
    }

}
