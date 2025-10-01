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
    // for addition both matrices rows and columns should be equal

    static int[][] addTwoMatrix(int[][] m1, int[][] m2, int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return m;
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
        System.out.println("Enter " + r1 * c1 + " element again for next matrix");
        int arr2[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = s.nextInt();
                System.out.print(arr2[i][j] + " ");
            }
        }
        System.out.println("new matrix is ");
        printMatrix(addTwoMatrix(arr1, arr2, r1, c1));
        s.close();
    }
}