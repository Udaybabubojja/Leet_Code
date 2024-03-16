class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int l=0, r=0, len=0;
        while(r<s.length()){
            if(h.containsKey(s.charAt(r))){
                l=Math.max(h.get(s.charAt(r))+1, l);
            }
            h.put(s.charAt(r), r);
            len= Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}