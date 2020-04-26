class Solution {
    public int numIslands(char[][] grid) {
        // we want to check that the input isn't empty 
        if(grid == null || grid.length == 0){
            return 0;
        }
        int numOfIslands =0;
        //traverse the grid 
        for(int i =0; i< grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                //if that grid cell contains a one thats when we check neighbors
                if(grid[i][j] == '1'){
                    numOfIslands +=  dfs(grid, i, j);
                }
            }
        }
        
        return numOfIslands;
        
    }
    
    
    public int dfs(char[][] grid, int i, int j){
        // make sure we havent gone outside the boundaries of the grid 
        if(i<0 || i>= grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0'){
            return 0;
        }
        
        //set that index point to zero so we don't look at it again. no need to preserve grid 
        grid[i][j] = '0';
        //recursively trace all vertices
        //right 
        dfs(grid, i+1, j);
        //left
        dfs(grid, i-1, j);
        //up
        dfs(grid, i, j+1);
        //down
        dfs(grid, i, j-1);
        return 1;
        
    }
    
}
