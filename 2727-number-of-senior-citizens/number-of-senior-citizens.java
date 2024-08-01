class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String s: details){
            int k = Integer.valueOf(s.substring(11,13));
            if (k>60) c++;
        }
        return c;
    }
}