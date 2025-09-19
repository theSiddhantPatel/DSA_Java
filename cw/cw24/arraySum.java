package cw24;

import java.util.List;
import java.util.Scanner;

public class arraySum {
    public static int simpleArraySum(int ar[]) {
        // Write your code here
        int total = 0;

        int n = ar.length;
        for (int i = 0; i < n; i++) {
            total += ar[i];
        }
        return total;

    }

    public static void main(String[] args) {
        int arr[];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(simpleArraySum(arr));
    }
}
