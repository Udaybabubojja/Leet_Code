class Solution {
    public int specialArray(int[] nums) {
        int x = nums.length;
        for(int i=x; i>=0; i--){
            int c=0;
            for(int j: nums){
                if (j>=i) c++;
            }
            if(i==c) return i;
        }
        
        return -1;
    }
}