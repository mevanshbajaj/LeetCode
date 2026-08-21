
class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        int min = 0;
        for(int i=1;i<=n;i++){
            min = arr[i] + Math.min(arr[i-1] , arr[i-2]);
        }
        return min;
    }
}