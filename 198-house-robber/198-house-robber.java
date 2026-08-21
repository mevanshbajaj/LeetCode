
class Solution {
    public int amount(int[] arr , int i , int[] dp){
        int n = arr.length;
        if(i>=n) return 0;
        if(dp[i] != -1) return dp[i];
        int take = arr[i] + amount(arr,i+2,dp);
        int skip = amount(arr,i+1,dp);
        dp[i] = Math.max(take,skip);
        return dp[i];
    }
    public int rob(int[] arr) {
        int n = arr.length;
        // i varies from 0 - n-1
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return amount(arr,0);
    }
}