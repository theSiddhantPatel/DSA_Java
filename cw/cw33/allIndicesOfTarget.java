package cw33;

//target element(all indices) search in an array using recursive approach
public class allIndicesOfTarget {

    static void search(int arr[], int idx, int x) {
        // base case
        if (idx >= arr.length)
            return; // ;
        // self work
        if (arr[idx] == x) {
            System.out.print(idx + " ");
            // return true;
        }
        // recursive work
        search(arr, idx + 1, x);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 6, 7, 8 };
        // if (search(arr, 0, 15)) {
        // System.out.println("Element found");
        // } else {
        // System.out.println("Element not found");
        // }
        search(arr, 0, 2);

    }
}
