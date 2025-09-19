package array;

public class ReverseAnArray {
    public static void solution(int[] arr) {
        // I think using 2 pointer is best approach for this solution
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 5, 03, 0, 4, 0 };
        solution(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
