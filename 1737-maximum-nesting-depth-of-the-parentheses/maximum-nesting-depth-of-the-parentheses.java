class Solution {

    public int maxDepth(String s) {
        int depth = 0;
        int openCount = 0;

        // we will iterate on every character of string but consider only open and close paranthesis.

        for(char ch : s.toCharArray()){
            if(ch == '(') openCount ++;
            if(ch == ')') openCount --;

            depth = Math.max(depth, openCount);
        }


        return depth;
    }
}