class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extra) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i : arr) if(i > max) max = i;
        List<Boolean> ans = new ArrayList<>();
        for(int i : arr){
            if(i + extra >= max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}