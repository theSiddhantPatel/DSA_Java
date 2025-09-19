package cw18Array;

public class evenOddsort {
    // sort an array consisting of numbers evens and odds using 2 pointers
    public static void array(int arr[]) {
        int left = 0, n = arr.length, right = n - 1;
        for (int i = 0; i < n; i++) {
            while (left <= right) {
                if (arr[left]%2 == 1 && arr[right]%2 == 0) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;

                } else if (arr[left]%2 == 0) {
                    left++;
                } else  {
                    right--;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        array(arr);
    }
}