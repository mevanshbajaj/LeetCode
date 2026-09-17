class Solution {
    List<List<String>> ans = new ArrayList<>();
    boolean[] cols, diag1, diag2;
    public List<List<String>> solveNQueens(int n) {
        cols = new boolean[n];
        diag1 = new boolean[2*n];
        diag2 = new boolean[2*n];
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        backtrack(0, n, board);
        return ans;
    }
      void backtrack(int row, int n, char[][] board) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board)
                temp.add(new String(r));
            ans.add(temp);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row - col + n] || diag2[row + col])
                continue;

            board[row][col] = '';
            cols[col] = diag1[row - col + n] = diag2[row + col] = true;

            backtrack(row + 1, n, board);

            board[row][col] = '.';
            cols[col] = diag1[row - col + n] = diag2[row + col] = false;
        }
    }
}