public class binarySearch {
    public static int binarySearch1(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int mid = (low + high) / 2;
        while ((arr[mid] != target) && (low <= high)) {
            mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            }
            // 1 2 3 4 5 6 7 8

            if (arr[mid] > target) {
                high = mid - 1;
            }

            if (target==arr[mid]) {
                return mid;
            }

        }
        return low-1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(binarySearch1(arr, 4));
    }
}