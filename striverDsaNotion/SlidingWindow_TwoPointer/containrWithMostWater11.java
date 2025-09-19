
package striverDsaNotion.SlidingWindow_TwoPointer;

class containrWithMostWater11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0,
                j = n - 1;
        int maxWater = Integer.MIN_VALUE;
        while (i < j) {
            int stored = Math.min(height[i], height[j]) * (j - i);// this bracket is used for bodmas;
            maxWater = Math.max(maxWater, stored);
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return maxWater;

    }
}