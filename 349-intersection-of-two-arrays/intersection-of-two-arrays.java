class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        int i=0, j=0,p=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){ s.add(nums1[i]); i++; j++;}
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int a[] = new int[s.size()];
        for(int k: s){
            a[p++]=k;
        }
        return a;
    }
}