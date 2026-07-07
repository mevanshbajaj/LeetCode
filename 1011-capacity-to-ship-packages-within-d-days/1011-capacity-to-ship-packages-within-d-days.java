class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int x : weights){
            left = Math.max(left,x);
            right += x;
        }
        while(left <= right){
            int mid = left + (right-left)/2;
            int day = 1;
            int cw = 0;
            for(int w : weights){
                if(cw + w > mid){
                    day++;
                    cw = w;
                }
                else cw += w;
            }
            if(day <= days) right = mid -1;
            else left = mid + 1;
        }
        return left;
    }
}