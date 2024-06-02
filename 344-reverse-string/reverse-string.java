class Solution {
    public void reverseString(char[] s) {
        int r = s.length;
        if(r==1) return;
        if((r&1)==1) r = (r/2)+1;
        else r = (r/2);
        int n=s.length;
        for(int i=0; i<r; i++){
            char c = s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=c;
        }
        return;
    }
}