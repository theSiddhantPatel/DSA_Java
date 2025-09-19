package contest.weekly463;

public class q1StockSellWithStrategy {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long maxProfit1 = 0;
        for (int i = 0; i < n; i++) {
            maxProfit1 += prices[i] * strategy[i];
        }

        int[] strategy2 = new int[n];
        for (int i = 0; i < n; i++) {
            strategy2[i] = strategy[i];
        }

        for (int i = 0; i < k / 2; i++) {
            strategy[i] = 0;
        }
        for (int i = k / 2; i < k; i++) {
            strategy[i] = 1;
        }
        long maxProfit2 = 0;
        for (int i = 0; i < n; i++) {
            maxProfit2 += prices[i] * strategy[i];
        }

        for (int i = n - k; i < n - k + (k / 2); i++) {
            strategy2[i] = 0;
        }
        for (int i = n - k + (k / 2); i < n; i++) {
            strategy2[i] = 1;
        }
        long maxProfit3 = 0;
        for (int i = 0; i < n; i++) {
            maxProfit3 += prices[i] * strategy2[i];
        }
        long max = Math.max(maxProfit1, maxProfit2);
        long max2 = Math.max(max, maxProfit3);
        return max2;

    }

    public static void main(String[] args) {
        q1StockSellWithStrategy x = new q1StockSellWithStrategy();
        int prices[] = { 4, 7, 13 };
        int strategy[] = { -1, -1, 0 };
        System.out.println(x.maxProfit(prices, strategy, 2));
    }
}
