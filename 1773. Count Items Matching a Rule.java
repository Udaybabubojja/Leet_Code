class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        if(ruleKey.equals("type")) c=0;
        else if(ruleKey.equals("color")) c=1;
        else c=2;
        int k=0;
        for(int i=0; i<items.size(); i++){
            if(items.get(i).get(c).equals(ruleValue)) k++;
        }
        return k;
    }
}
