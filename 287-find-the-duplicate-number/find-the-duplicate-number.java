class Solution {
    public int findDuplicate(int[] nums) {
        int a[] = new int[nums.length];
        for(int i: nums){
            if(a[i]==0) a[i]=1;
            else return i;
        }
        return 0;
    }
}