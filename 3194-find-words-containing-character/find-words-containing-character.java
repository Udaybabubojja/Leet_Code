class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> a = new ArrayList<>();
        int k=0;
        String u = String.valueOf(x);
        for(String i: words){
            if(i.contains(u)) a.add(k);
            k++;
        }
        return a;
    }
}