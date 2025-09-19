package array;

public class ArrayRotation2 {
    public static void rotateArray(int[] arr, int x) {
        int n = arr.length;
        x=x%n;
        reverseArray(arr, 0, x - 1);
        reverseArray(arr, x, n - 1);
        reverseArray(arr, 0, n - 1);
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
