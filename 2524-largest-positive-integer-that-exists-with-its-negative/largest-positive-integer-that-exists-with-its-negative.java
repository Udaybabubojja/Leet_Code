class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>i; j--){
                if(nums[i]==-1*nums[j]) return nums[j];
            }
        }
        return -1;
    }
}