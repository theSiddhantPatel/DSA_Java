package cw20;

import java.util.Scanner;

public class addMatrices {
    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void add(int c1, int c2, int r1, int r2, int arr1[][], int arr2[][]) {
        // if (c1 != c2 || r1 != r2) {
        // System.out.println("wrong input");
        // return;
        // }
        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printMatrix(sum);
    }

    @SuppressWarnings("resource")
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
        // int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // printMatrix(arr);
        // for arr1
        // for arr2
        System.out.println("Enter rows in array2");
        int r2 = s.nextInt();
        System.out.println("Enter columnss in array2");
        int c2 = s.nextInt();
        if (c1 != c2 || r1 != r2) {
            System.out.println("wrong input for addition: r1!=r2 & c1!=c2 ");
            return;
        }
        System.out.println("Enter " + r2 * c2 + " elements");
        int arr2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = s.nextInt();
                System.out.print(arr2[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("The addition of arr1 and arr2 is");
        add(c1, c2, r1, r2, arr1, arr2);

    }
}