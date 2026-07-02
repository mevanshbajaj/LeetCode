
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int j = 1;
        int[] ans = new int[2];
        while(j<numbers.length){
            if((numbers[i]+numbers[j])==target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            else if((numbers[i]+numbers[j])<target){
                j++;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}