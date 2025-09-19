package cw37;

public class bubbleSort {
    public static void bubblesort(int[] arr) {
    
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }
            }
            if (flag == false)
                return;

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 4, 2 };
        bubblesort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
