
class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])) return true;
            set.add(arr[i]);
        if(set.size() > k) set.remove(Math.abs(arr[i-k]));
        }
        return false;
    }
}