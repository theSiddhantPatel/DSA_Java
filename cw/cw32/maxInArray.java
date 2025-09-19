package cw32;
//max in array using recursion

public class maxInArray {
   protected static int max = Integer.MIN_VALUE;

    public static void printArray(int arr[], int idx) {
        if (idx == arr.length)
            return;
        if (max < arr[idx]) {
            max = arr[idx];
        }
        printArray(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 2, -54 };
        printArray(arr, 0);
        System.out.print(max);

    }
}
