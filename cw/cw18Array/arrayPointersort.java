package cw18Array;
// sort an array consisting of only 0's and 1's using 2 pointers

import java.util.ArrayList;

public class arrayPointersort {
    // optimized approach
    public static void arrayZeroAndOneSort(int arr[]) {
        int left = 0, n = arr.length, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

            } else if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    // naive approach count zeros or ones and fill it
    public static ArrayList<Integer> sortZeroAndOne(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int zeros = 0;
        for (int i : arr) {
            if (i == 0) {
                zeros++;
            }
        }
        int ones = arr.length - zeros;
        while (zeros > 0) {
            list.add(0);
            zeros--;
        }
        while (ones > 0) {
            list.add(1);
            ones--;
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 0, 0, 1, 0, 1, 1 };
        // arrayZeroAndOneSort(arr);
        System.out.println(sortZeroAndOne(arr));
    }
}
