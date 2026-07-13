class Solution {
    public int maxProfit(int[] arr) {
        int maxprofit = 0;
        int min = Integer.MAX_VALUE;
        for(int x : arr){
             min = Math.min(min,x);
             maxprofit = Math.max(maxprofit,x-min);
        }
        return maxprofit;
    }
}