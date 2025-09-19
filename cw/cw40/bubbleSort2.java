package cw40;

// sort an array by zero in last without changing any condition
public class bubbleSort2 {
    public static void zeroSort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {  // if(flag==false)
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 2 };
        zeroSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}