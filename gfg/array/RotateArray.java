package array;

public class RotateArray {
    public static void solution(int[] arr, int d) {
        d %= arr.length;
        for (int i = 0; i < d; i++) {
            int rotatedNum = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = rotatedNum;

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        solution(arr, 2);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
