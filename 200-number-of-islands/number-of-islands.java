class Solution {
    int island;
    public void dfs(char[][] grid, int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1'){
            return ;
        }
        grid[i][j]='9';
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        
    }
    public int numIslands(char[][] grid) {
        island=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i, j);
                    island++;
                }
            }
        }
        return island;
    }
}