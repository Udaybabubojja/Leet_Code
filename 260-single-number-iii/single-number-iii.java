class Solution {
    public int[] singleNumber(int[] nums) {
          HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        int[] a = new int[2];
        int c = 0;
        for(int i : h.keySet()) {
            if(h.get(i) == 1) {
                a[c++] = i;
            }
        }
        return a;
    }
}