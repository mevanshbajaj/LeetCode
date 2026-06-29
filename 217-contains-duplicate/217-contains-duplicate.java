class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) { set.add(num);
        if(!set.contains(num)) return false;
        }
        else return true;
    }
}