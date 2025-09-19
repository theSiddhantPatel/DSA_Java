import java.util.Scanner;
@SuppressWarnings("resource")
public class ChefDiet {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int j = 0;
            int sum = 0;
            while ( (j < n) &&(arr[j] + sum >= k)) {
                // sum += Math.abs(k - arr[j]);
                sum+=arr[j]-k;
                j++;
            }
            if (j==arr.length)
                System.out.println("Yes");
            else
                System.out.println("NO " + (j + 1));

        }

    }
}
