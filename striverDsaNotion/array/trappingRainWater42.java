package striverDsaNotion.array;

public class trappingRainWater42 {
    public int trap(int[] height) {
        int n = height.length;
        int res = 0;
        int[] leftMax = getLeftMax(height);
        int[] rightMax = getRightMax(height);
        for (int i = 1; i < n; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];

        }
        return res;
    }

    public int[] getLeftMax(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);

        }
        return leftMax;
    }

    public int[] getRightMax(int[] height) {
        int n = height.length;
        int[] rightMax = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);

        }
        return rightMax;
    }
}
