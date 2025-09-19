package striverDsaNotion.array;

//https://leetcode.com/problems/set-matrix-zeroes/
public class setMatrixZeroes73 {
    // better approach
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        // 1st pass - record the rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // // 2nd pass - zero the rows
        // for (int i = 0; i < m; i++) {
        // if (zeroRows[i]) {
        // for (int j = 0; j < n; j++) {
        // matrix[i][j] = 0;
        // }
        // }
        // }
        // // 3rd pass - zero the columns
        // for (int j = 0; j < n; j++) {
        // if (zeroCols[j]) {
        // for (int i = 0; i < m; i++) {
        // matrix[i][j] = 0;
        // }
        // }
        // }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // optimal approach
    public static void setZeroes2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check if first row or column has 0
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
            }
        }

        // Step 2: Use first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3: Use markers to set zeroes
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero first row and column if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // setZeroes(matrix);
        setZeroes2(matrix);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
