class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0, a = 0, b = 0;
        long count = 0;
        int k2 = 0;

        // i -> first odd
        while (i < n && arr[i] % 2 == 0)
            i++;

        // j -> kth odd
        while (j < n && k2 < k) {
            if (arr[j] % 2 != 0)
                k2++;

            j++;
        }

        // Less than k odd numbers
        if (k2 < k)
            return 0;

        j--;

        // b -> last even after kth odd
        b = j + 1;

        while (b < n && arr[b] % 2 == 0)
            b++;

        b--;

        while (b < n) {
            count += (long)(i - a + 1) * (b - j + 1);

            // i -> next odd
            a = i + 1;
            i++;

            while (i < n && arr[i] % 2 == 0)
                i++;

            // j -> next odd
            j = b + 1;

            b = j + 1;

            while (b < n && arr[b] % 2 == 0)
                b++;

            b--;
        }
        return (int) count;
    }
}