
class Solution {
    public void moveZeroes(int[] arr) {
        int idx = 0;
       for(int x : arr) if(x != 0) arr[idx++] = x;
       while(idx < arr.length) arr[idx++] = 0;
    }
}