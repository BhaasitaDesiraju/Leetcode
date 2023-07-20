class NumberOfIslands {
    public int numIslands(char[][] grid) {
        // if grid is empty of null return 0
        if(grid.length == 0 || grid == null) {
            return 0;
        }
        
        int numIslands = 0;
        // loop through the grid
        for(int i = 0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                numIslands += dfs(grid, i, j);
            }
        }
        return numIslands;
    }
    
    public int dfs(char[][] grid, int i, int j) {
        // edge case scenarios - i, j boundaries or if value at grid is 0
        if(i < 0 || i >= grid.length || j < 0 || j>=grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        //set elem as visited - mark it as 0
        grid[i][j] = '0';
        
        //dfs of adjacent elements
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        return 1;
    }
}
