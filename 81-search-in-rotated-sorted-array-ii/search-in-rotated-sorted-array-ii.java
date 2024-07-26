class Solution {
    public boolean search(int[] a, int x) {
        int l=0, r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if (a[mid]==x) return true;
            if(a[l]==a[mid]&&a[mid]==a[r]){
                l+=1;
                r-=1;
                continue;
            }
            if(a[l]<=a[mid]){
                if(a[l]<=x && x<=a[mid]){
                    r=mid-1;
                }
                else l=mid+1;
            }
            else{
                if(a[r]>=x && x>=a[mid]){
                    l=mid+1;
                }
                else r=mid-1;
            }
        }
        return false;
    }
}