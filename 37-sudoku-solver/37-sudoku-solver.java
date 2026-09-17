
class Solution {
    public void solveSudoku(char[][] board) {
        return solve(row,board,n);
        if(row == n){
            c++;
            return;
        }
        for(itnt col=0;col<n;col++){
            if(issafe(row,col,board)){
                board[row][col]='Q';
                solve(row+1,board,n);
                board[row][col]=' ';
            }
        }
    }
}