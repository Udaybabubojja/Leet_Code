class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> h = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            char k1 = s.charAt(i);
            char k2 = t.charAt(i);
             // If k1 is already mapped but to a different character k2
            if (h.containsKey(k1)) {
                if (h.get(k1) != k2) {
                    return false;
                }
            } else {
                // If k1 is not yet mapped, but k2 is already used by another character
                if (h.containsValue(k2)) {
                    return false;
                }
                // Map k1 to k2
                h.put(k1, k2);
            }
        }
        return true;
    }
}