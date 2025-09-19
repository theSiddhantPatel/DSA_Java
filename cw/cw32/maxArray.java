package cw32;

public class maxArray {
    public static int printarray(int[] arr, int idx) {
        // base case
        // if only 1 value in array then its index will be 0(and zero
        // means(arr.length-1))
        // because if only 1 element in array then length=1 but index=0
        if (idx == arr.length-1) {
            return arr[idx];
        }
        int small = printarray(arr, idx + 1);
        return Math.max(small, arr[idx]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 39, 4, 5 };
        // System.out.println(arr.length);
        System.out.println(printarray(arr, 0));
    }
}
