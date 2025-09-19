package striverDsaNotion.array;

class nextPermutation31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int markIndex = -1;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                markIndex = i - 1;
                break;
            }
        }
        //Step 2: If no pivot found, reverse whole array
        if (markIndex == -1) {
            reverse(nums, 0);
            return;
        }
        /*
         * Problem: What if markIndex == -1?
         * This happens when the array is in descending order (e.g., [3,2,1]).
         * You cannot access nums[markIndex] in that case — it throws
         * ArrayIndexOutOfBoundsException.
         * ❗ Fix:
         * Added a condition to handle that case:
         */
        int swapIndex = markIndex;
        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > nums[markIndex]) {
                swapIndex = j;
                break;
            }
        }
        // swap both elements
        int temp = nums[markIndex];
        nums[markIndex] = nums[swapIndex];
        nums[swapIndex] = temp;
        // reverse the remaining array after markIndex;
        reverse(nums, markIndex + 1);
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        nextPermutation31 sol = new nextPermutation31();
        sol.nextPermutation(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
