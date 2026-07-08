
class Solution {
    public int maxSubArray(int[] arr) {
     int sum = 0 , max = arr[0];
     for(int x : arr){
        sum += x;
        max = Math.max(max,sum);
        if(sum<0) sum=0;
     }
     return max;
    }
}