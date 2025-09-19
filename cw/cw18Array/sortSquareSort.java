package cw18Array;

public class sortSquareSort {
    // sort an array consisting of numbers in square format in non decreasing order
    // i.e. array= {-10,-5,2,3,8,9} then o/p=100,81,64,25,9,4
    public static void array(int arr[]) {
        int left = 0, n = arr.length, right = n -1, k = n-1, ans[] = new int[n];
        while (left <= right) {
        for (int i = 0; i < n; i++) {
                if (Math.abs (arr[left]) > Math.abs(arr[right])) {
                
                    ans[k--] = arr[left] * arr[left];
                    left++;

                } else {
                    ans[k--] = arr[right] * arr[right];

                    right--;
                }
                System.out.print(ans[k] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {-10,5,4,8};
        array(arr);
    }

}