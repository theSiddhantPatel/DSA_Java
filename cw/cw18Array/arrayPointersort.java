package cw18Array;
// sort an array consisting of only 0's and 1's using 2 pointers

public class arrayPointersort {
    public static void array(int arr[]) {
        int left = 0, n = arr.length, right = n - 1;
        for (int i = 0; i < n; i++) {
            while (left < right) {
                if (arr[left] == 1 && arr[right] == 0) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;

                }
                if (arr[left] == 0) {
                    left++;
                }
                if (arr[right] == 1) {
                    right--;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1,0,1,0 };
        array(arr);
    }
}
