
class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}