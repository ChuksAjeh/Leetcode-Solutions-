package com.company;

public class NumOfIslands {

    public static void main(String[] args) {


        char[][] grid = {
        {'1','1','0','0','0'},
        {'1','1','0','0','1'},
        {'0','0','0','0','0'},
        {'1','0','0','1','1'},};

        System.out.println(numIslands(grid));
    }

    /*
    * Given a 2D grid of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and
    * is formed by connecting adjacent lands horizontally or vertically. You may assume all four  edges of the grid are
    * surrounded by water.
    *
    *Input: grid = [
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
    ]
    Output: 1
    *
    *
    * Input: grid = [
    ["1","1","0","0","0"],
    ["1","1","0","0","0"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
    ]
    Output: 3
    *
    * */

    public static int numIslands(char[][] grid){
        // is the grid empty?
        if(grid == null || grid.length ==0){
            return 0;
        }
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count += dfs(grid, i,j);
                }
            }
        }
        return count;
    }

    // we want to use a depth first search to go as deep in one direction as possible before turning back: runtime O(V+E)
    public static int dfs(char[][] grid, int row, int col){
        // boundary/base case
        if(row<0 || row>=grid.length || col <0 || col >= grid.length|| grid[row][col] == '0'){
            return 0;
        }
        //recursive case:
        // index is set at zero
        grid[row][col] = '0';
        //left
        dfs(grid, row-1, col);
        //right
        dfs(grid, row+1, col);
        //up
        dfs(grid, row, col+1);
        //down
        dfs(grid, row, col-1);
        return 1;
    }
}
