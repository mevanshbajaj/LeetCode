
class Solution {
    public int maxProfit(int[] arr) {
        int minprice = arr[0];
        int max = 0;
        for(int x : arr){
            minprice = Math.min(minprice,x);
            int profit = x - minprice;
            max = Math.max(max,profit);
        }
        return max;
    }
}