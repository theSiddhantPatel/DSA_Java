package cw33;

public class arraySearch {
    public static int array(int[] arr, int idx, int x) {
        if (idx >= arr.length)
            return -1;

        if (arr[idx] == x)
            return idx;
        return array(arr, idx + 1, x);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 6, 7, 8 };
        System.out.println(array(arr, 0, 2));
    }
}
