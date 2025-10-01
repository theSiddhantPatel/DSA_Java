package cw16;

// import java.util.Arrays;

public class secondLargestElement {
    static int largest(int[] arr) {
        int max = -Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondLarge(int[] arr) {

        int max = largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = -2147483648;
            }
        }
        int max2 = largest(arr);
        return max2;
    }

    public static int secondLargest(int[] arr) {
        int max = -1;
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > max)) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static int secondSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min1 > arr[i]) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] > min1)
                min2 = arr[i];
        }
        return min2;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 15 };
        // Arrays.sort(arr);
        // for (int i = arr.length - 1; i > 0; i--) {
        // if (arr[i] != arr[i - 1]) {
        // System.out.println(arr[i]);
        // System.out.println(arr[i - 1]);
        // break;
        // }
        // }
        // System.out.println(secondLargest(arr));
        // System.out.println(secondLarge(arr));
        System.out.println(secondSmallest(arr));
    }
}
