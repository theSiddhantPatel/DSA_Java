package cw18Array;

public class sortArray0and1 {
    // sort an array consisting of only 0's and 1's
    public static void array(int arr[]) {
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;

            }
        }
        // 0 to zeroes-1: 0 and zeroes to n-1: 1
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroes) {
                arr[i] = 0;

            } else {
                arr[i] = 1;

            }
            System.out.print(arr[i] + " ");
        }
        // System.out.println(arr);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 0 };
        System.gc();// garbage collector
        // System.out.println(arr);
        array(arr);
    }
}
