class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        double maxDiagonal = 0;
        int maxArea = 0;
        
        for (int i = 0; i < d.length; i++) {
            double currentDiagonal = Math.sqrt(d[i][0] * d[i][0] + d[i][1] * d[i][1]);
            int currentArea = d[i][0] * d[i][1];
            
            if (currentDiagonal > maxDiagonal || (currentDiagonal == maxDiagonal && currentArea > maxArea)) {
                maxDiagonal = currentDiagonal;
                maxArea = currentArea;
            }
        }
        
        return maxArea;
    }
}