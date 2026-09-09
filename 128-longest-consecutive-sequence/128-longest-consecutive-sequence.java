class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int curr = n;
                int length = 1;
            }
        }
    }
}