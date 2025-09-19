import java.util.Scanner;

public class q2fibonacci {
    public static int printFibonacci(int n) {
        if (n == 0) {
            // System.out.print(0);
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            // System.out.print(1);/
            return 2;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);

    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int x = 0;
        while (T != x) {
            int sum = 0;

            System.out.println("enter n ");
            int m = scanner.nextInt();

            // for (int i = 2; sum < m; i++) {
            int i = 2;
            while (sum < m) {
                ///int n;
                int n = printFibonacci(i);
                if (n % 2 == 0) {
                    sum += n;
                }
                i++; //
            }
            System.out.println(sum);
            T--;
        }
        System.out.println(printFibonacci(9));
    }
}
