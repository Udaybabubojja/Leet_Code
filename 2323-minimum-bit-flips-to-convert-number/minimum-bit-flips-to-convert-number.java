class Solution {
    public int minBitFlips(int start, int goal) {
        int d = start^goal;
        int c =0;
        while(d!=0){
            if((d&1)==1) c++;
            d=d>>1;
        }
        return c;
    }
}