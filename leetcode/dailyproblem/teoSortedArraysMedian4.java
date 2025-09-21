package dailyproblem;

public class teoSortedArraysMedian4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = Math.min(n1, n2);
        int n = n1 + n2;
        int nums[] = new int[n];
        n1 = 0;
        n2 = 0;
        long sum = 0;
        for (int i = 0; i < n3; i++) {
            if (nums1[n1] >= nums2[n2]) {
                nums[i] = nums2[n2];
                n2++;
            } else {
                nums[i] = nums1[n1];
                n1++;
            }
            sum += nums[i];
        }
        return sum;

    }
}
