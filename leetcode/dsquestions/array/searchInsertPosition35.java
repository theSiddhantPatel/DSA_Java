package dsquestions.array;

public class searchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int j = nums.length;
        int i = 0;
        while (i < j) {
            int mid = (i + j) / 2;// bodmas
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                i = mid + 1;
            else
                j = mid;
        }
        return i;
    }

    public static void main(String[] args) {
        searchInsertPosition35 x = new searchInsertPosition35();
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(x.searchInsert(nums, 2));
    }

}
