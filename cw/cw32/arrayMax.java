package cw32;

public class arrayMax {
    public static int array(int arr[], int idx) {
        if (idx == arr.length-1) {
            return arr[idx];
        }
        int max2 = array(arr, idx + 1);
        return (Math.max(arr[idx], max2));
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 9, 3, 1 };
        System.out.println(array(arr, 0));
    }
}
