package array;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int x) {
        int n = arr.length;
        x %= n; // this is required for Exception in thread "main"
                // java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length
                // 1
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, n - x - 1);
        reverseArray(arr, n - x, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int x = 2;

        rotateArray(arr, x);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
