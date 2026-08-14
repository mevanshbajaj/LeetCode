class Solution {
    public int maxSatisfied(int[] customers, int[] arr, int k) {
        int n = customers.length, i = 0, j = k - 1;
        int unsatisfied = 0;
        int satisfied = 0;

        int a = i, b = j, maxunsatisfied = 0;

        // Customers already satisfied
        for (int x = 0; x < n; x++) {
            if (arr[x] == 0) {
                satisfied += customers[x];
            }
        }

        // First window
        for (int x = i; x <= j; x++) {
            if (arr[x] == 1) {
                unsatisfied += customers[x];
            }
        }

        while (j < n) {
            if (maxunsatisfied < unsatisfied) {
                maxunsatisfied = unsatisfied;
                a = i;
                b = j;
            }
            i++;
            j++;
            if (j < n && arr[j] == 1) {
                unsatisfied += customers[j];
            }
            if (arr[i - 1] == 1) {
                unsatisfied -= customers[i - 1];
            }
        }
        return satisfied + maxunsatisfied;
    }
}