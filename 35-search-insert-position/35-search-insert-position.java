class Solution {
    public int searchInsert(int[] arr, int target) {
        int start = 0 , end = arr.length;
        while(start<=end){
        int mid = end/2;
        if(mid == target) return mid;
        else if(mid > target) start++;
        else end--;
        }
        return -1;
    }
}