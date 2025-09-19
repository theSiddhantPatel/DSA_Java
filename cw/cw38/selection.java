package cw38;

public class selection {
    public static void Selection(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 9, 6, 7 };
        Selection(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
