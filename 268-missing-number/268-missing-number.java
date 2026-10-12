class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int total = n * (n+1) / 2;
        for(int ele : arr) sum += ele;
        int mis = total-sum;
        return mis;
    }
}