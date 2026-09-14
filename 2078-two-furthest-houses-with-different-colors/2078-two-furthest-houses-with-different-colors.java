
class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        int ans = 0;
        if(arr[0] != arr[n-1]) return n - 1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[0]) ans = Math.max(ans,i);
        }
        for(int i= n - 2;i>=0;i--){
            if(arr[i] != arr[n-1]) ans = Math.max(ans,n-1-i);
        }
        return ans;
    }
}