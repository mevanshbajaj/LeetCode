class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
        rev(arr,0,n-1);
    }
    void rev(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;end--;
    }
}