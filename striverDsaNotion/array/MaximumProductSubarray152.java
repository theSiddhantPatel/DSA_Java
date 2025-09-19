package striverDsaNotion.array;

public class MaximumProductSubarray152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int product = 1;
                if (nums[j] > 0) {
                    product *= nums[j];
                    maxProduct = Math.max(product, maxProduct);
                }
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        MaximumProductSubarray152 x = new MaximumProductSubarray152();
        int[] nums = { 2, -3, -2, 4 };
        System.out.println(x.maxProduct(nums));

    }
}
