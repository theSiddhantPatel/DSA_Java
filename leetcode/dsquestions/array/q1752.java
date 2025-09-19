package array;

// 1752.Check if Array Is Sorted and Rotated
//https://chat.deepseek.com/a/chat/s/9171eee0-9384-42d3-865d-9f6653839c34

public class q1752 {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int violations = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                violations++;
                if (violations > 1) {
                    return false;
                }
            }
        }
        if (violations == 1) { // array is rotated
            return nums[n - 1] <= nums[0]; // array is correctly rotated , after rotation last element should be <=first
                                           // element of the array.
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 3, 4, };
        System.out.println(check(arr));
    }
}
