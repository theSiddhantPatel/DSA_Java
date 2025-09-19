package cw21;

import java.util.Scanner;

public class transposeMatrix {
    static void printarray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows of arr1");
        int r1 = s.nextInt();
        System.out.println("Enter number of columns of arr1");
        int c1 = s.nextInt();
        System.out.println("Enter " + r1 * c1 + " elements");
        int arr1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        // System.out.println("Enter rows in array2");
        // int r2 = s.nextInt();
        // System.out.println("Enter columnss in array2");
        // int c2 = s.nextInt();
        // if (c1 != c2 || r1 != r2) {
        // System.out.println("wrong input for addition: r1!=r2 & c1!=c2 ");
        // return;
        // }
        // System.out.println("Enter " + r2 * c2 + " elements");
        // int arr2[][] = new int[r2][c2];
        // for (int i = 0; i < r2; i++) {
        // for (int j = 0; j < c2; j++) {
        // arr2[i][j] = s.nextInt();
        // System.out.print(arr2[i][j] + " ");
        // }
        // }
        // System.out.println();
        printarray(arr1);

    }
}