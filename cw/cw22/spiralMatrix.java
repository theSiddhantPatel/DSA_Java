package cw22;

import java.util.Scanner;

public class spiralMatrix {
    static void inputMatrix() {
        System.out.println("Enter rows");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        System.out.println("Enter columns");
        int c = s.nextInt();
        int[][] Matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Printed Matrix is");
        printMatrix(Matrix);
        System.out.println("Spiral matrix is ");
        printSpiral(Matrix, r, c);
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiral(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftColumn = 0, rightColumn = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            // topRow -> leftCol to rightCol
            for (int j = leftColumn; j <= rightColumn && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
            }
            topRow++;
            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
            }
            rightColumn--;
            // bottomRow-> rightCol to leftCol
            for (int j = rightColumn; j >= leftColumn && totalElements < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
            }
            bottomRow--;
            // leftCol-> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftColumn] + " ");
            }
            leftColumn++;
            totalElements += 4;
        }
    }

    public static void main(String[] args) {
        inputMatrix();
        // printMatrix(Matrix);
        // printSpiral(null, 0, 0);
    }

}
