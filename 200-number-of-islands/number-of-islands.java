class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // number of rows
        int n = grid[0].length; // number of columns

        boolean[][] vis = new boolean[m][n]; // to track visited cells
        int res = 0; // to count the number of islands

        // iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // if the cell is land ('1') and not visited yet
                if (grid[i][j] == '1' && !vis[i][j]) {
                    res++; // increment island count
                    dfs(grid, i, j, vis); // perform DFS to mark the entire island as visited
                }
            }
        }
        return res; // return the total number of islands
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] vis) {
        int rows = grid.length; // number of rows
        int cols = grid[0].length; // number of columns

        // boundary and base condition check
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0' || vis[i][j]) {
            return; // return if out of bounds, water ('0'), or already visited
        }

        vis[i][j] = true; // mark the current cell as visited

        // perform DFS in all 4 directions
        dfs(grid, i + 1, j, vis); // down
        dfs(grid, i - 1, j, vis); // up
        dfs(grid, i, j + 1, vis); // right
        dfs(grid, i, j - 1, vis); // left
    }
}
