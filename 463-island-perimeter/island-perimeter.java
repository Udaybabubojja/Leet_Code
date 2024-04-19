class Solution {
    int peri;
    public void dfs(int[][] grid, int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            peri++;
            return ;
        }
        if(grid[i][j]==-1){return ;}
        grid[i][j]=-1;
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        
    }
    public int islandPerimeter(int[][] grid) {
        peri=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    dfs(grid, i, j);
                    return peri;
                }
            }
        }
        return 0;
    }
}