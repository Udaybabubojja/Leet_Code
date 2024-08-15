class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5=0, c10=0, c20=0;
        for(int i: bills){
            if(i==5) c5+=1;
            else if(i==10){
                c10+=1;
                c5-=1;
            }
            else{
                c20+=1;
                if(c10>=1 && c5>=1){
                    c10-=1;
                    c5-=1;
                }
                else{
                    c5-=3;
                }
            }
            if(c5<0 || c10<0|| c20<0) return false;
        }
        return true;
    }
}