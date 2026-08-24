
class Solution {
    public int paths(int i , int j , int m , int n,int[][] dp) {
        if(i >= m || j >= n) return 0;
        if(i == m-1 || j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int rightways = paths(i,j+1,m,n,dp);
        int downways = paths(i+1,j,m,n,dp);
        return dp[i][j] = rightways + downways;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        Arrays.fill(dp,-1);
        return paths(0,0,m,n,dp);
    }
}