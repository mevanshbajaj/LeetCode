
class Solution {
    public int mincost(int[] arr,int n , int[] dp) {
        // here n is position where person is standing 
        if(n == 0 || n == 1) return arr[n];
        if(dp[n] != -1) return dp[n];
        return dp[n]= arr[n] + Math.min(mincost(arr,n-1,dp),mincost(arr,n-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
}