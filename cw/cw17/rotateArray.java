package cw17;

public class rotateArray {
    // public static int[] array(int arr[], int k) {
    // int n = arr.length;
    // k = k % n;
    // int j = 0;
    // int[] ans = new int[n];
    // for (int i = n - k; i < n; i++) {
    // ans[j++] = arr[i];
    // }
    // for (int i = 0; i < n - k; i++) {
    // ans[j++] = arr[i];
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5 };
    // System.out.print(array(arr, 1)+" ");
    // }
    // }

    public static int[] array(int arr[], int k) {
        // Edge case: Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            System.out.println("Array is null or empty.");
            return new int[0];
        }

        int n = arr.length;
        k = k % n; // Handle cases where k is greater than the length of the array
        if (k < 0) {
            k = k + n; // Handle negative k values
        }

        System.out.println("Array length (n): " + n);
        System.out.println("Effective k after modulo operation: " + k);

        int j = 0;
        int[] ans = new int[n];

        // First loop: Copy the last k elements to the beginning of the new array
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
            System.out.println("Copying arr[" + i + "] to ans[" + (j - 1) + "]: " + arr[i]);
        }

        // Second loop: Copy the first n - k elements to the remaining positions in the
        // new array
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
            System.out.println("Copying arr[" + i + "] to ans[" + (j - 1) + "]: " + arr[i]);
        }

        // Print the final rotated array
        System.out.print("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        return ans;
    }


    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        array(arr, 1);

    }
}
