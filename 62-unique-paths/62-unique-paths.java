
class Solution {
    public int paths(int i , int j , int m , int n) {
        if(i >= m || j >= n) return 0;
        if(i == m-1 || j == n-1) return 1;
        int rightways = paths(i,j+1,m,n);
        int downways = paths(i+1,j,m,n);
        return rightways + downways;
    }
    public int uniquePaths(int m, int n) {
        return paths(0,0,m,n);
    }
}