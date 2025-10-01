package cw20;

import java.util.Scanner;

public class multiplyMatrices {
    public static void printarray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void multiply(int c1, int c2, int r1, int[][] arr1, int[][] arr2) {
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                mul[i][j] += arr1[i][j] * arr2[j][j];

            }
        }
        System.out.println("Multiplication of matrices");
        printarray(mul);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // for arr1
        System.out.println("Enter number of rows of arr1");
        int r1 = s.nextInt();
        System.out.println("Enter number of columns of arr1");
        int c1 = s.nextInt();
        System.out.println("Enter " + r1 * c1 + " elements");
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        // for arr2
        System.out.println("Enter rows in array2");
        int r2 = s.nextInt();// it should be equal to c1

        System.out.println("Enter columnss in array2");
        int c2 = s.nextInt();
        if (c1 != r2) {
            System.out.println("wrong input for multiplication: c1!=r2 ");

        }
        System.out.println("Enter " + r2 * c2 + " elements");
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        System.out.println();
        multiply(c1, c2, r1, arr1, arr2);
        s.close();
    }
}
