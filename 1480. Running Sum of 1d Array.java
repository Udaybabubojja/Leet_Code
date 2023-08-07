class Solution {
    public int[] runningSum(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            c+=nums[i];
            nums[i]=c;
        }
        return nums;
    }
}
