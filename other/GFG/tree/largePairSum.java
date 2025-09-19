package tree;
import java.util.Scanner;

public class largePairSum {
    public static int pairsum(int[] arr) {

        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (sum < (arr[i] + arr[j])) {
                    sum = (arr[i] + arr[j]);
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
       System.out.println( pairsum(int[] arr));

    }
}
