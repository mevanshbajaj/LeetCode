
class Solution {
    public int majorityElement(int[] arr) { //o(n) o(1)
        int count = 0;
        int can = 0;
        for(int num : arr){
            if(count == 0) can = num;
            if(num == can) count++;
            else count--;
        }
        return can;
    }
}