package cw17;

public class arrayReverse {
    public static void arrRev(int[] arr) {
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        arrRev(arr);
    }
}