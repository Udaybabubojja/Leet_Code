class Solution {
    public int scoreOfString(String s) {
        int score=0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length()-1; i++){
            score+=Math.abs(sb.charAt(i)-sb.charAt(i+1));
        }
        return score;
    }
}