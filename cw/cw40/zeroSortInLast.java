package cw40;

public class zeroSortInLast {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 0, 4, 0, 9, 7, 0 ,7};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(0 + " ");
        }
    }
}