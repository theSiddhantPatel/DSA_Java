package cw33;

//target element search in an array using recursive approach
public class arrayRecSearch {
    static boolean search(int arr[], int idx, int x) {
        // base case
        if (idx >= arr.length)
            return false; // ;
        // self work
        if (arr[idx] == x)
            return true;
        // recursive work
        return (search(arr, idx + 1, x));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        if (search(arr, 0, 15)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

    }
}
