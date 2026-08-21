class Solution {
    public int amount(int[] arr , int i){
        if(i >= arr.length) return 0;
        int take = arr[i] + amount(arr,i+2);
        int skip = amount(arr,i+1);
        return Math.max(take,skip);
    }
    public int rob(int[] arr) {
        int n = arr.length;
        return amount(arr,0);
    }
}