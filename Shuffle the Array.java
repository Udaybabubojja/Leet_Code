class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[nums.length];
        for(int i=0,j=0; i<a.length; i+=2,j++){
            a[i]=nums[j];
            a[i+1]=nums[j+n];
        }
        return a;
    }
}
