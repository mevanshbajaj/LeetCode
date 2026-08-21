
class Solution {
    public int largestInteger(int[] arr, int k) {
        int n = arr.length;
        int ans = -1;
        for(int x : arr){
            int count = 0;
            for(int i=0;i<=n-k;i++){
                boolean flag = false;
                for(int j=i;j<i+k;j++){
                    if(arr[j] == x){
                        flag = true;
                        break;
                    }
                }
                if(flag) count++;
            }
            if(count == 1) ans = Math.max(ans,x);
        }
        return ans;
    }
}