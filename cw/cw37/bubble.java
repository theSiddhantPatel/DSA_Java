package cw37;

public class bubble {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.print(arr[j] + " ");

            }

            System.out.println();
            // System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 2, 1 };
        bubbleSort(arr);
    }
}
