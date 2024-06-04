class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> h = new HashSet<>();
        int l=0;
        for(char c: s.toCharArray()){
            if(h.contains(c)){
                h.remove(c);
                l+=2;
            }
            else{
                h.add(c);
            }
        }
        if(!h.isEmpty()) l+=1;
        return l;
    }
}