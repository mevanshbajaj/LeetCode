
class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return fun(0, arr, dp);
    }
    int fun(int i, int[] arr, int[] dp) {
        int n = arr.length;
        if (i >= n) return 0;
        if (dp[i] != -1) return dp[i];
        int take = arr[i] + helper(i + 2, arr, dp);
        int skip = helper(i + 1, arr, dp);
        return dp[i] = Math.max(take, skip);
    }
}