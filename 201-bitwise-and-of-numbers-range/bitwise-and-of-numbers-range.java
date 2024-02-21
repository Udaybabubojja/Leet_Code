class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        
        // Find the common prefix (MSB to the rightmost differing bit)
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        
        // Left shift back to restore the result
        return left << shift;
    }
}