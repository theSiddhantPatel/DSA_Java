package array;

public class MoveAllZeroestoEnd {
    public static void solution(int[] arr) {
        int j = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        while (j < arr.length) {
            temp[j++] = 0;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 4, 5, 0 };
        solution(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}