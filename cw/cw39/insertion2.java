package cw39;

public class insertion2 {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 4, 6 };
        insertionSort(arr);
        for (int k : arr) {
            System.out.print(k + " "); // Fixed the printing logic
        }
    }
}