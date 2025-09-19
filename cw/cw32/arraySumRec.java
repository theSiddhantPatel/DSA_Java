package cw32;

public class arraySumRec {
    public static int arr(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int sum = arr(arr, idx + 1);
        return (sum + arr[idx]);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 9, 10 };
        System.out.println(arr(arr, 0));
    }
}
