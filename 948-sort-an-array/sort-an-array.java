class Solution {
    public static void divide(int arr[], int low, int high){
        if(low>=high) return;
        int mid = low+(high-low)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low, int mid, int high){
        int a[] = new int[high-low+1];
        int i=low, j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]) a[k++]=arr[i++];
            else a[k++]=arr[j++];
        }
        while(i<=mid) a[k++]=arr[i++];
        while(j<=high) a[k++]=arr[j++];
        for(int ar=0, b=low; ar<a.length; ar++,b++)arr[b]=a[ar];
    }
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
}