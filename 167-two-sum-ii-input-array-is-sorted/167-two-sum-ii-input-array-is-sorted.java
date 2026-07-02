
class Solution {
    public int[] twoSum(int[] n, int target) {
        int i = 0;
        int j = n.length-1;
            int[] ans = new int[2];
        while(i<n.length){
            if(n[i]+n[j]==target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            else if(n[i]+n[j]<target) i++;
            else j--;
        }
        return new int[]{-1,-1};
    }
}