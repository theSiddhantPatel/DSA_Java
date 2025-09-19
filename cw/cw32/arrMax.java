package cw32;

public class arrMax {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, -8 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.print(max);
    }
}