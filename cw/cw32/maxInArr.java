package cw32;
//max in array using iteration
public class maxInArr {
    // public static void printArray(int arr[], int idx) {
    // if (idx == arr.length) {
    // return;
    // }

    // }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6,-8 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max)
                max = arr[i];
        }
        System.out.print(max);
    }
}
