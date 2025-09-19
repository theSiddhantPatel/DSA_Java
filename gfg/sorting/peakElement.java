package sorting;

class peakElement {
    public static int Solution(int[] arr) {
        // Handle edge cases
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return 1;
        }
        if (arr[0] > arr[1]) {
            return 1;
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return 1;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 8, 3 };
        if (Solution(arr) == 0) {
            System.out.println(false);
        } else
            System.out.println(true);

        // System.out.println(((peakElement(arr))));
    }
}
