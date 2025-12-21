import java.util.*;

class Solution {
    List<List<String>> result = new ArrayList<>();
    boolean[] col;
    boolean[] diag1;
    boolean[] diag2;

    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, n, board);
        return result;
    }

    void backtrack(int row, int n, char[][] board) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (col[c] || diag1[row - c + n] || diag2[row + c]) {
                continue;
            }

            board[row][c] = 'Q';
            col[c] = true;
            diag1[row - c + n] = true;
            diag2[row + c] = true;

            backtrack(row + 1, n, board);

            board[row][c] = '.';
            col[c] = false;
            diag1[row - c + n] = false;
            diag2[row + c] = false;
        }
    }
}
