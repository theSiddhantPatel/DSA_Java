package dsquestions.array;

import java.util.HashSet;
import java.util.Set;

public class validSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        // validate rows
        for (int row = 0; row < 9; row++) {
            Set<Character> set = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char val = board[row][col];
                if (val == '.') {
                    continue;
                }
                if (set.contains(val)) {
                    return false;
                }
                set.add(val);
            }
        }
        // validate columns
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                Set<Character> set = new HashSet<>();
                char val = board[col][row];
                if (val == '.') {
                    continue;
                }
                if (set.contains(val)) {
                    return false;
                }
                set.add(val);
            }
        }
        // validate 3*3 matrix
        for (int startRow = 0; startRow < 9; startRow += 3) {
            int endRow = startRow + 2;
            for (int startCol = 0; startCol < 9; startCol += 3) {
                int endCol = startCol + 2;
                if (!validBox(board, startRow, endRow, startCol, endCol)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean validBox(char[][] board, int sr, int er, int sc, int ec) {
        Set<Character> st = new HashSet<>();
        for (int i = sr; i < er; i++) {
            for (int j = sc; i < ec; j++) {
                char val = board[i][j];
                if (val == '.') {
                    continue;
                }
                if (st.contains(val))
                    return false;
                st.add(val);
            }
        }
        return true;
    }

    boolean isValidSudoku2(char[][] board) {
        Set<String> st = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val == '.')
                    continue;
                String row = val + "_ROW_" + i;
                String col = val + "_COL_" + j;
                String box = val + "_BOX_" + (i / 3) + "_" + (j / 3);

                if (st.contains(row) || st.contains(col) || st.contains(box)) {
                    return false;
                }

                st.add(row);
                st.add(col);
                st.add(box);
            }
        }
        return true;
    }
}
