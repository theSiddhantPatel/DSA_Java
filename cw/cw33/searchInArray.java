package cw33;

import java.util.Scanner;

public class searchInArray {
  
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 90, 5, 3, 54, 6, 8, 54, 3 };
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.print((i) + " ");
            }
        }
        s.close();
    }
}
