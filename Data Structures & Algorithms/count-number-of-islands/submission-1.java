class Solution {

    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int islands = 0;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    islands++;
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r>= grid.length || c >= grid[0].length || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        for (int[] dir : directions) {
            dfs(grid, r + dir[0], c + dir[1]);
        }
    }
}
