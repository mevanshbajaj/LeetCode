class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;

        if (k == n) {
            for (int num : nums) {
                ans = Math.max(ans, num);
            }
            return ans;
        }
        for (int i = 0; i < k; i++) {
            boolean unique = true;
            for (int j = 0; j < k; j++) {
                if (i != j && nums[i] == nums[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                ans = Math.max(ans, nums[i]);
            }
        }
        for (int i = n - k; i < n; i++) {
            boolean unique = true;
            for (int j = n - k; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                ans = Math.max(ans, nums[i]);
            }
        }
        return ans;
    }
}