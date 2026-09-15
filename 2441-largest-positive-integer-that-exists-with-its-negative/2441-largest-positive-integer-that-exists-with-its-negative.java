
class Solution {
    public int findMaxK(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr) set.add(n);
        int ans = -1;
        for(int n : arr){
            if(n > 0 && set.contains(-n)) ans = Math.max(ans,n);
        }
        return ans;
    }
}