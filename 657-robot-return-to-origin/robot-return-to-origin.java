class Solution {
    public boolean judgeCircle(String s) {
        int c1=0, c2=0;
        for(char i: s.toCharArray()){
            if(i=='U') c1+=1;
            else if(i=='L')c2+=1;
            else if(i=='R')c2-=1;
            else c1-=1;
        }
        return (c1==0 && c2 ==0);
    }
}