class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++){
            String k = operations[i];
            if(k.charAt(0)=='+') ++x;
            else if(k.charAt(2)=='+') x++;
            else if(k.charAt(0)=='-') --x;
            else x--;
        }
        return x;
    }
}
