class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[0] + arr[1] + arr[2];
        for(int i=0;i<arr.length-2;i++){
            int left = i+1 , right = arr.length-1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                if(Math.abs(sum-target)<Math.abs(ans-target)) ans = sum;
                if(sum < target) left++;
                else if(sum > target) right--;
                else return ans;
            }
        }
        return ans;
    }
}