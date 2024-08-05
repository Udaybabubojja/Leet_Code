class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> h = new HashMap<>();
        for(String s: arr){
            h.put(s, h.getOrDefault(s,0)+1);
        }
        int c=0;
        for(String s : arr){
            if(h.get(s)==1){
                c+=1;
                if(c==k) return s;
            }
        }
        return "";
    }
}