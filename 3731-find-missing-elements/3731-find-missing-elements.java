
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length-1];
        int j = 0;
        for (int i = start; i <= end; i++) {
            if (j < nums.length && nums[j] == i) {
                while (j < nums.length && nums[j] == i) j++;
            } else ans.add(i);
        }
        return ans;
    }
}