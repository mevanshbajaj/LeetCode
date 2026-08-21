
class Solution {
    public int mincost(int[] arr,int n) {
        return arr[n] + Math.min(mincost(arr,n-1),mincost(arr,n-2));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return mincost(arr,n-1);
    }
}