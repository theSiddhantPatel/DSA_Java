package sorting;

public class SearchinRotatedSortedArray {
    class Solution {
        int search(int[] arr, int key) {
            // Complete this function
            int n = arr.length;
            for (int i = 0; i < (n / 2) + 1; ++i) { // is it will be considered n/2 or n
                if (arr[i] == key) {
                    return i;
                }
                if (arr[n - 1 - i] == key) {
                    return (n - 1 - i);
                }
            }
            return -1;
        }
    }
}
