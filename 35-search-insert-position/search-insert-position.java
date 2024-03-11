class Solution {
    public int searchInsert(int[] a, int target) {
        if(a[0]>target)
        return 0;
        int low=1;
        int high=a.length-1;
        if(a[high]<target)
        return ++high;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>=target && target >a[mid-1])
            return mid;
            if(a[mid]>target){
                high=--mid;
            }
            else{
                low=++mid;
            }
        }
        return 0;
    }
}