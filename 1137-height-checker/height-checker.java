class Solution {
    public int heightChecker(int[] heights) {
        int k[] = new int[heights.length];
        for(int i=0; i<k.length; i++){
            k[i]=heights[i];
        }
        Arrays.sort(heights);
        int c=0;
        for(int i=0; i<k.length; i++){
            if(k[i]!=heights[i]) c++;
        }
        return c;
    }
}