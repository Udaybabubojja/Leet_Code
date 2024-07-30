class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0; // Number of 'b's encountered so far
        int minDeletions = 0; // Minimum number of deletions needed
        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                bCount++;
            } else { // ch == 'a'
                if (bCount > 0) {
                    minDeletions++;
                    bCount--; // We "delete" one 'b' by balancing it with the current 'a'
                }
            }
        }

        return minDeletions;
    }
}