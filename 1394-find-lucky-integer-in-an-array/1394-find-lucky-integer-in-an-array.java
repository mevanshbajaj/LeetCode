
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int ans = -1;
        for(int key : map.keySet()){
            if(key == map.get(key)) ans = Math.max(ans,key);
        }
        return ans;
    }
}