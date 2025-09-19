package striverDsaNotion.array;

public class stockBuyAndSell122 {
    // greedy approach
    public int maxProfit(int[] prices) {
        int n = prices.length, profit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }

            /*
             * or
             * if (prices[i + 1] > prices[i]) {
             * profit += prices[i + 1] - prices[i];
             * }
             * 
             */

        }
        return profit;
    }
}
