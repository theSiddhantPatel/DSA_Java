package contest.biweekly166;

public class climbingStairs2 {
    public static int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            int j = Math.max(0, i - 3);

            for (; j < i; j++) {
                int jumpCost = costs[i - 1] + (i - j) * (i - j);
                dp[i] = Math.min(dp[i], dp[j] + jumpCost);
            }
        }
        return dp[n];
    }

    public static int minCostToReachStep(int n, int[] costs) {
        // Step 1: Create an array to store minimum cost to reach each step
        int[] minCost = new int[n + 1];

        // Step 2: Start at step 0 with 0 cost
        minCost[0] = 0;

        // Step 3: Calculate for each step from 1 to n
        for (int currentStep = 1; currentStep <= n; currentStep++) {
            // Start with a very large number
            minCost[currentStep] = Integer.MAX_VALUE;

            // Step 4: Check all possible previous steps (1, 2, or 3 steps back)
            for (int prevStep = currentStep - 3; prevStep < currentStep; prevStep++) {
                // Only consider valid previous steps (not negative)
                if (prevStep >= 0) {
                    // Calculate jump distance
                    int jumpDistance = currentStep - prevStep;

                    // Calculate jump cost: step cost + distance squared
                    int stepCost = costs[currentStep - 1]; // Cost of current step
                    int jumpCost = stepCost + (jumpDistance * jumpDistance);

                    // Total cost = cost to reach previous step + jump cost
                    int totalCost = minCost[prevStep] + jumpCost;

                    // Keep the minimum cost found
                    if (totalCost < minCost[currentStep]) {
                        minCost[currentStep] = totalCost;
                    }
                }
            }
        }

        // Step 5: Return minimum cost to reach the top (step n)
        return minCost[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int[] costs = { 5, 1, 6, 2 };
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            int j = Math.max(0, i - 3);

            for (; j < i; j++) {
                int jumpCost = costs[i - 1] + (i - j) * (i - j);
                dp[i] = Math.min(dp[i], dp[j] + jumpCost);
            }
        }
        System.out.println(dp[n]);
    }
}
