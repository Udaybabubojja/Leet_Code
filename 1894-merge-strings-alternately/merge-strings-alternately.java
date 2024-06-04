class Solution {
    public String mergeAlternately(String word1, String word2) {
        String k ="";
        int r= word1.length()>word2.length()?word2.length():word1.length();
        int l=0;
        while(l<r){
            k+=word1.charAt(l);
            k+=word2.charAt(l);
            l++;
        }
        while(l<word1.length()) k+=word1.charAt(l++);
        while(r<word2.length()) k+=word2.charAt(r++);
        return k;
    }
}