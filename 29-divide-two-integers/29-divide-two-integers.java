
class Solution {
    public int divide(int dividend, int divisor) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        if (dividend == INT_MIN && divisor == -1) return INT_MAX;
       boolean negative = (dividend < 0) ^ (divisor < 0);
       long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int quotient = 0;
        // Build the quotient bit by bit
        for (int i = 31; i >= 0; i--) {
            if ((dvs << i) <= dvd) {
                dvd -= (dvs << i);
                quotient += (1 << i);
            }
        }
        return negative ? -quotient : quotient;
    }
}