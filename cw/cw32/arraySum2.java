package cw32;

public class arraySum2 {
    public static int arr(int arr[], int idx) {
        // base case
        if (idx == arr.length) {
            return 0;
        }
        // recursive work
        int sum = arr(arr, idx + 1);
        // small problems and self work
        return (sum + arr[idx]);
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(arr(arr, 0));
    }
}
