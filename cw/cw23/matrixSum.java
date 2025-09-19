package cw23;

import java.util.Scanner;

public class matrixSum {
    static int rectSum(int[][] matrix, int c1, int c2, int c3, int c4) { // c=cordinate
        int sum = 0;
        for (int i = c1; i <= c3; i++) {
            for (int j = c2; j <= c4; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Enter rows and columns of matrix");

        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int matrix[][] = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = s.nextInt();
            }
            // System.out.print(matrix[i][j]+" ");
        }
        System.out.println("Enter rectangle boundries c1 c2 c3 c4");
        int c1 = s.nextInt();
        int c2 = s.nextInt();
        int c3 = s.nextInt();
        int c4 = s.nextInt();
        System.out.println("Rectangle Sum = " + rectSum(matrix, c1, c2, c3, c4));
    }
}
