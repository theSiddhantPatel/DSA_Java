package cw18Array;

public class squareSort {
    // sort an array consisting of numbers in square format in non decreasing order
    // i.e. array= {-10,-5,2,3,8,9} then o/p=4,9,25,64,81,100

    public static void sqrtSort(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] sorted = new int[n];
        int index = n - 1;

        while (left < right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                sorted[index--] = arr[left] * arr[left];
                left++;
            } else {
                sorted[index--] = arr[right] * arr[right];
                right--;
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    public static void sqrtSortDecreasing(int[] arr) {
        int left = 0, right = arr.length - 1, index = 0;
        int[] sorted = new int[right + 1];

        while (left < right) {
            if (Math.abs(arr[left]) < Math.abs(arr[right])) {
                sorted[index++] = arr[right] * arr[right];
                right--;
            } else {
                sorted[index++] = arr[left] * arr[left];
                left++;
            }
        }
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -10, -3, -2, 0, 1, 4, 5 };
        sqrtSort(arr);
        System.out.println();
        sqrtSortDecreasing(arr);

    }

}