class Solution {
    public int passThePillow(int n, int time) {
        int c=1;
        boolean k = false;
        for(int i=0; i<time; i++){
            if (c == 1) {
                k = false; // Switch to forward direction if at the start
            } else if (c == n) {
                k = true; // Switch to backward direction if at the end
            }
            
            if (k) {
                c--; // Move backward
            } else {
                c++; // Move forward
            }
        }
        return c;
    }
}