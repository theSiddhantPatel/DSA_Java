package striverDsaNotion.array;

public class mergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1; // Last index in nums1 to fill

        // Merge from the end
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        // If nums2 has remaining elements, copy them
        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n--;
            last--;

            /*
             * assume when
             * nums1 = [0, 0, 0]
             * m = 0
             *
             * nums2 = [2, 5, 6]
             * n = 3
             *
             */
            // No need to handle remaining nums1 elements — they’re already in place

        }
    }

}
