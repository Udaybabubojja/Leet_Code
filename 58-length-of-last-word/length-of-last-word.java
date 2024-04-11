class Solution {
    public int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        for(int i=splited.length-1; i>=0; i--){
            splited[i] = splited[i].replaceAll("\\s", "");
            if(splited[i].length()>0) return splited[i].length();
        }
        return 0;
    }
}