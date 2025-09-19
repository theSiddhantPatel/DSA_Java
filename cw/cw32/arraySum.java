package cw32;

public class arraySum {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 4, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
