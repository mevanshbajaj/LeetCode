class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[2];
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0;i<n-2;i++){
            int left = i+1;
            int right = n - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    return target;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
                int difftotarget = Math.abs(sum - target);
                if(difftotarget < mindiff){
                    result = sum;
                    mindiff = difftotarget;
                }
            }
        }
        return result;
    }
}