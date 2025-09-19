package array;

public class secondLargest {
    public static int sl(int arr[]) {

        int fl = arr[0], sl = Integer.MIN_VALUE; // fl=first largest , sl=second largest
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (fl < arr[i]) {
                fl = arr[i];
            }
            if (arr[i - 1] > sl && fl > arr[i - 1]) {
                sl = arr[i - 1];
            }
            if (arr[n - 1] > sl && fl > arr[n - 1]) { // for comparing last element
                sl = arr[n - 1];
            }
        }
        // if no second largest element found
        if (sl == Integer.MIN_VALUE) {
            return -1;
        }
        return sl;

    }

    public static void main(String[] args) {
        int arr[] = { 28078 ,19451 ,935, 28892, 2242 ,3570, 5480, 231 };
        System.out.println("Second largest element is: " + sl(arr));

    }
}