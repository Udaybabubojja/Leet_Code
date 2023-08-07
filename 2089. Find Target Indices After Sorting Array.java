class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target)a.add(i);
        }
        return a;
    }
}
