package array;

public class sl2 {
    public static int largest(int[] arr) {
        // Code Here
        int large = Integer.MIN_VALUE;
        // int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        // System.out.println(largest);
        return large;
    }

    public  static int getSecondLargest(int arr[]) {
        int largest2 = largest(arr);
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == largest2) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        // if (arr[i] == Integer.MIN_VALUE) {
        // return -1;
        // }
        int secondLarge = largest(arr);
        // System.out.println(secondLarge);
        if (secondLarge == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLarge;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 10 };
        System.out.print(getSecondLargest(arr));
        // secondLarge(arr);
    }
}
