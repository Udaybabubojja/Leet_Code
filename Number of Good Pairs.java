class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        int k=nums.length;
        for(int i=0; i<k;i++){
            for(int j=0; j<i; j++){
                if(nums[i]==nums[j]) c++;
            }
        }
        return c;
    }
}
