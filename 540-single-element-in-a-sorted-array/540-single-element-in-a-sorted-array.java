class Solution {
    public int singleNonDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(!set.contains(i)) { 
            set.add(i);
            }
            else set.remove(i);
        }
        return set.iterator().next();
    }
}