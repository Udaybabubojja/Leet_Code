class Solution {
    public int[] reverse(int a[], int start, int end){
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind=i;
                break;
            }
        }
        System.out.println(ind);
        if(ind==-1){
            reverse(nums, 0, nums.length-1);
            return ;
        }
        for(int i = nums.length-1; i>ind; i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        reverse(nums, ind+1, nums.length-1);
    }
}