
class Solution {
    public int maxProfit(int[] arr) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int price : arr){
            minprice = Math.min(minprice,price);
            maxprofit = Math.max(maxprofit,price-minprice);
        }
        return maxprofit;
    }
}