class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        int result = 0;
        while (n >= d) {
            int shift = 0;
            while (n >= (d << shift))
                shift++;
            shift--;
            result += 1 << shift;
            n -= d << shift;
        }
        return negative ? -result : result;
    }
}
