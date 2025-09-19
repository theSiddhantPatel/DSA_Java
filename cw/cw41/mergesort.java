package cw41;

public class mergesort {
    static void mergeSort(int[] arr, int l, int r) {
        if (l == r) { // base case for single size array
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid); // preorder function calling in tree
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1; // n1= size of left array
        int n2 = r - mid; // n2= size of right array
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++)
            left[i] = arr[l + i]; // merging divided array's element 1 by 1 (filling in new array after merging)
        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) 
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];

        }
        while (i < n1) { // if divided part of left arr is bigger then it will work
            arr[k++] = left[i++];

        }
        while (j < n2) { // if divided part of right arr is bigger then it will work
            arr[k++] = right[j++];

        }
    }

    public static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 0, 3, 8, 6, 0 };
        int n = arr.length;
        System.out.println("Array before sorting");
        print(arr);
        System.out.println();
        mergeSort(arr, 0, n - 1);
        // merge(arr, 0, 2, 4);
        System.out.println("Array after sorting");
        print(arr);
    }
}