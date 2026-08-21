
class Solution {
    public int mincost(int[] arr,int n) {
        // here n is position where person is standing 
        if(n == 0 || n == 1) return arr[n];
        
        return arr[n] + Math.min(mincost(arr,n-1),mincost(arr,n-2));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(mincost(cost,n-1),mincost(cost,n-2));
    }
}