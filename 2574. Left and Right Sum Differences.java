class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l[]= new int[nums.length];
        int r[] = new int[nums.length];
        l[0]=0;
        r[r.length-1]=0;
        for(int i=0, j=r.length-1; i<l.length-1&&j>0; i++,j--){
            l[i+1]=nums[i]+l[i];
            r[j-1]=nums[j]+r[j];
        }
        int ans[] = new int[nums.length];
        for(int i=0; i<ans.length; i++){
            ans[i]=Math.abs(l[i]-r[i]);
        }
        return ans;
    }
}
