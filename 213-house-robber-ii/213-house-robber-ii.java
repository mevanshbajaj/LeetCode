
class Solution {
    public int amount(int[] arr, int i, int end, int[] dp) {
        if (i > end) return 0;
        if (dp[i] != -1) return dp[i];
        int take = arr[i] + amount(arr, i + 2, end, dp);
        int skip = amount(arr, i + 1, end, dp);
        dp[i] = Math.max(take, skip);
        return dp[i];
    }
    public int rob(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int case1 = amount(arr, 0, n - 2, dp1);
        int case2 = amount(arr, 1, n - 1, dp2);
        return Math.max(case1, case2);
    }
}