class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: if dividend is the smallest integer and divisor is -1, return the maximum integer value to prevent overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);

        // Convert both numbers to positive
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        int result = 0;

        // Subtract divisor from dividend using bitwise shifts
        while (n >= d) {
            int shift = 0;
            // Find the largest shift such that (divisor * 2^shift) <= dividend
            while (n >= (d << shift)) {
                shift++;
            }
            // The actual shift needed is one less than the while loop incremented
            shift--;
            // Add 2^shift to the result
            result += 1 << shift;
            // Subtract (divisor * 2^shift) from the dividend
            n -= d << shift;
        }

        // Apply the sign to the result
        return negative ? -result : result;
    }
}
