package dsquestions.array;

import java.util.HashSet;
import java.util.Set;

public class q2133 {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> rowSet = new HashSet<>();
            // hastSet can be easily changed in any other data structure when needed
            Set<Integer> colSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                rowSet.add(matrix[i][j]);
                colSet.add(matrix[j][i]);
            }
            if (rowSet.size() != n || colSet.size() != n) {
                return false;
            }
        }
        return true;
    }
}
