package striverDsaNotion.array;

public class maximumSubarray53 {
    // function to print all subarrays
    public static void allSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(", ");
            }
        }
    }

    // public static int maxSubArraysum2(int[] arr) {// btute force approach
    // int n = arr.length;
    // int max = 0;
    // for (int i = 0; i < n; i++) {
    // for (int j = i; j < n; j++) {
    // int sum = 0;
    // for (int k = i; k <= j; k++) {
    // sum += arr[k];
    // }
    // max = Math.max(sum, max);
    // }
    // }
    // return max;
    // }

    public static int maxSubArraysum(int[] arr) {// btute force approach (something better)
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    // optimal approach (kadane's algo)
    int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -10, -4, -3, 2,-2, -5, };
        maximumSubarray53 x = new maximumSubarray53();

        // allSubarrays(arr);
        System.out.println(x.maxSubArray(arr));
        
    }

}
