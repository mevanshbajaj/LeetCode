class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0, a = 0, b = 0, count = 0, k2 = 0;

        // Move i to first odd
        while (i < n && arr[i] % 2 == 0)
            i++;

        // Move j to the kth odd
        while (j < n && k2 < k) {
            if (arr[j] % 2 != 0) {
                j++;
                k2++;
            }
        }

        // Fewer than k odd numbers
        if (k2 < k)
            return 0;
        j--;
        // Move b to the last even after kth odd
        b = j + 1;
        while (b < n && arr[b] % 2 == 0)
            b++;
        b--;
        while (b < n) {
            count += (i - a + 1) * (b - j + 1);
            // Move to next odd
            a = i + 1;
            i++;

            while (i < n && arr[i] % 2 == 0)
                i++;

            // Move j to next odd
            j = b + 1;

            b = j + 1;
            while (b < n && arr[b] % 2 == 0)
                b++;

            b--;
        }
        return count;
    }
}