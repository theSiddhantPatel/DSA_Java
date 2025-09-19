import java.util.ArrayList;
import java.util.List;
class spiralMatrix {

  static List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> res = new ArrayList<>();

    if (matrix.length == 0) {
      return res;
    }

    int topRow = 0;
    int bottomRow = matrix.length - 1;
    int leftColumn = 0;
    int rightColumn = matrix[0].length - 1;

    while (topRow <= bottomRow && leftColumn <= rightColumn) {
      // Traverse Right
      for (int j = leftColumn; j <= rightColumn; j++) {
        res.add(matrix[topRow][j]);
      }
      topRow++;

      // Traverse Down
      for (int j = topRow; j <= bottomRow; j++) {
        res.add(matrix[j][rightColumn]);
      }
      rightColumn--;

      if (topRow <= bottomRow) {
        // Traverse Left
        for (int j = rightColumn; j >= leftColumn; j--) {
          res.add(matrix[bottomRow][j]);
        }
      }
      bottomRow--;

      if (leftColumn <= rightColumn) {
        // Traverse Up
        for (int j = bottomRow; j >= topRow; j--) {
          res.add(matrix[j][leftColumn]);
        }
      }
      leftColumn++;
    }

    return res;
  }
  public static void main(String[] args) {
    int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    System.out.print(spiralOrder(matrix));
  }
}