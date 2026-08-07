
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=n;i++){
            int rem = target - arr[i];
            if(map.contains(rem)) return new int[] {map.get(rem),i};
            else map.put(arr[i] , i);
        }
        return new int[]{};
    }
}