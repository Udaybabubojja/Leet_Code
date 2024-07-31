class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        int k=address.length();
        for(int i=0; i<address.length(); i++){
            char c = address.charAt(i);
            if(c=='.') s.append("[.]");
            else s.append(c);
        }
        return s.toString();
    }
}