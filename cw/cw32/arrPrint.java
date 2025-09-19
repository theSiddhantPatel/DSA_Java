package cw32;

//print an array using recursion
public class arrPrint {
    public static void printArray(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int index = 2;
        printArray(arr, index);
    }
}
