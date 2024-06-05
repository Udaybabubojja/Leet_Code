class Solution {
    public List<String> commonChars(String[] words) {
        List<String> a = new ArrayList<>();
        for(int i=0; i<words[0].length(); i++){
            char k = words[0].charAt(i);
            int c=0;
            for(int j = 1; j<words.length; j++){
                if(words[j].contains(String.valueOf(k))){ 
                    c++;
                    System.out.println(words[j]);
                    words[j] = words[j].replaceFirst(String.valueOf(k), "");
                }
            }
            if(c==words.length-1){ a.add(String.valueOf(k));}
        }
        return a;
    }
}