
class Solution {
    public int longestAlternatingSubarray(int[] arr, int threshold) {
        int len = 0 , n = arr.length;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > threshold || arr[i] % 2 != 0) {
                start = i + 1; continue;
            }
            int j = i + 1;
            while (j < n && arr[j] <= threshold && arr[j] % 2 != arr[j - 1] % 2) j++;
            len = Math.max(len, j - i);
            i = j - 1;
        }
        return len;
    }
}