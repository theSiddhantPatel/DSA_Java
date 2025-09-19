import java.util.Scanner;

public class ChefAndStrings {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 1; i < n; i++) {
                sum += Math.abs(arr[i - 1] - arr[i]) - 1;
            }
            System.out.println(sum);
        }

    }

}