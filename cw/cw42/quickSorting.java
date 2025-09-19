package cw42;

public class quickSorting {
    public static void quickSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int pivot=partition(int []arr, int start,int end);
    }

    public static void partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
            int pivotIndex = start + count;
            swap(arr, start, pivotIndex);
            int i = start, j = end;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 0, 3, 8, 6, 0 };
        int n = arr.length;
        System.out.println("Array before sorting");
        print(arr);
        System.out.println();
        quickSort(arr, 0, n - 1);
        System.out.println("Array after sorting");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
