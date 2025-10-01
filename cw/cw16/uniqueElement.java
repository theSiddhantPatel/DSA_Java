package cw16;

public class uniqueElement {
    public static int findUnique(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                else if (j + 1 == arr.length && count == 1)
                    return arr[i];

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 5, 5, 5, 7, 3, 8, 9, 1 };
        System.out.println(findUnique(arr));
    }
}
