class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(int i=0; i<sentences.length;i++){
            String s[]=sentences[i].split(" ");
            if(s.length>c)c=s.length;
        }
        return c;
    }
}
