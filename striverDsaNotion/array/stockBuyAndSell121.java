package striverDsaNotion.array;

public class stockBuyAndSell121 {
    public int maxProfit(int[] nums) {
        int maxProfit = 0;
        int bestBuy = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, nums[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, nums[i]);
            /*
             * or we can write the above line  like that
             * else bestBuy=nums[i];
             */
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        stockBuyAndSell121 x = new stockBuyAndSell121();
        int arr[] = { 1, 2, 5, 3, 4, 6 };
        System.out.println(x.maxProfit(arr));
    }
}
