class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=3) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int minDifference = Integer.MAX_VALUE;
        minDifference = Math.min(minDifference, nums[n - 4] - nums[0]); // Remove 3 largest
        minDifference = Math.min(minDifference, nums[n - 1] - nums[3]); // Remove 3 smallest
        minDifference = Math.min(minDifference, nums[n - 3] - nums[1]); // Remove 2 largest and 1 smallest
        minDifference = Math.min(minDifference, nums[n - 2] - nums[2]); // Remove 1 largest and 2 smallest
        return minDifference;
    }
}