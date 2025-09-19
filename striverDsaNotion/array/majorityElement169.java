package striverDsaNotion.array;

public class majorityElement169 {
    public static int majorityElement(int[] nums) {
        // Boyer Moore voting algorithm
        int n = nums.length;
        int count = 1;
        int majEl = nums[0];
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                count = 1;
                majEl = nums[i];
            } else if (nums[i] == majEl)
                count++;
            else
                count--;
        }
        return majEl;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 10, 11, 2, 2, 5, 19 };
        System.out.println(majorityElement(nums));
    }
}
