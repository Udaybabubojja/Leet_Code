class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length<=1) return nums;
        int a[] = new int[nums.length];
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0) a[c++]= nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==1) a[c++]= nums[i];
        }
        return a;
    }
}