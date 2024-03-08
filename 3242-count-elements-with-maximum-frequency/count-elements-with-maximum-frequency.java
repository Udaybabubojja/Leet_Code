class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i: nums){
            h.put(i, h.getOrDefault(i,0)+1);
        }
        int max = -1;
        for(int i: h.keySet()){
            if(h.get(i)>max) max=h.get(i);
        }
        int c=0;
        for(int i:h.keySet()){
            if(h.get(i)==max) c+=max;
        }
        return c;
    }
}