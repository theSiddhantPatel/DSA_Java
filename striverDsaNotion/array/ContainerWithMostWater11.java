package striverDsaNotion.array;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        int i = 0, j = n - 1;
        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            int stored = minHeight * (j - i);
            maxWater = Math.max(stored, maxWater);
            if (height[i] < height[j]) {
                i++;
            }else 
            j--;
        }
        return maxWater;

    }

}
