class Solution {
    public int amount(int[] arr , int i){
        int n = arr.length;
        int[] dp = new int[n];
        if(i>=n) return 0;
        if(dp[n] != -1) return dp[i];
        int take = arr[i] + amount(arr,i+2);
        int skip = amount(arr,i+1);
        dp[n] = Math.max(take,skip);
        return dp[n];
    }
    public int rob(int[] arr) {
        int n = arr.length;
        // i varies from 0 - n-1
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return amount(arr,0);
    }
}