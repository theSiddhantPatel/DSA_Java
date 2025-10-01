package cw17;

public class rotateArrayByKsteps {
    // brute force
    public static void rotateArrayByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            return;
        }
        int[] rotated = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            rotated[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            rotated[j++] = arr[i];
        }
        for (int i : rotated) {
            System.out.print(i + " ");
        }

    }

    // optimized

    public static void rotateArray2(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        arrayRev(arr, n - k, n - 1);
        arrayRev(arr, 0, n - k - 1);
        arrayRev(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /*
     * Standard reversal algorithm for left rotation:
     * arrayRev(arr, 0, k - 1); // Reverse first k elements
     * arrayRev(arr, k, n - 1); // Reverse remaining elements
     * arrayRev(arr, 0, n - 1); // Reverse entire array
     */

    public static void arrayRev(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // rotateArrayByK(arr, 2);
        rotateArray2(arr, 3);
    }

}
