class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        int i =0 , j = 0 , a = 0 , b = 0 , count = 0 , k2 = 0;
        // for(int x=0;x<n;x++) arr[x] %= 2;
        // move  ito first odd
        while(i<n&&arr[i]%2=0) i++;
        // j ko kth odd number
        while(j<n&&k2 < k){
            if(arr[j]%2!=0){
                j++;k2++;
            }
            j--;
        }
        b = j + 1;
        while(b<n&&arr[b]%2==0) b++;
        b--;
        while(b<n){
            count += (i-a+1)*(b-j+1);
            a = i+1;
            i++;
            while(i<n&&arr[i]%2==0) i++;
            j = b+1;
            b=j+1;
            while(b<n&&arr[b]%2==0) b++;
            b--;
        }
        return count;
    }
}