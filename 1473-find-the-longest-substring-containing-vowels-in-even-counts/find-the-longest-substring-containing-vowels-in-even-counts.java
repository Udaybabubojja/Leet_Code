class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1);  // For cases where the substring starts from index 0

        int mask = 0;  // Represents the state of vowels
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Update mask based on the current character
            if (c == 'a') {
                mask ^= 1 << 0;  // Toggle the bit for 'a'
            } else if (c == 'e') {
                mask ^= 1 << 1;  // Toggle the bit for 'e'
            } else if (c == 'i') {
                mask ^= 1 << 2;  // Toggle the bit for 'i'
            } else if (c == 'o') {
                mask ^= 1 << 3;  // Toggle the bit for 'o'
            } else if (c == 'u') {
                mask ^= 1 << 4;  // Toggle the bit for 'u'
            }
            
            // If this mask has been seen before, calculate the substring length
            if (seen.containsKey(mask)) {
                maxLength = Math.max(maxLength, i - seen.get(mask));
            } else {
                // Store the first occurrence of the mask
                seen.put(mask, i);
            }
        }
        
        return maxLength;
    }
}