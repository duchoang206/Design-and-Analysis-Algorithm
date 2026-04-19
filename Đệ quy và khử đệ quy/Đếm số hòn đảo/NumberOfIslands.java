public class NumberOfIslands {

    /**
     * Đếm số đảo trên biển
     *
     * @param grid ma trận 0/1
     * @return số đảo
     */
    public int countIslands(int[][] grid) {
        int soHang = grid.length;
        int soCot = grid[0].length;
        int count = 0;
        if ( grid == null || grid.length == 0) {
            return 0;
        }
        for ( int i = 0; i < soHang ; i++ ) {
            for ( int j =0 ; j < soCot ; j++) {
                if ( grid[i][j] ==1) {
                    count++;
                    dfs(grid, i, j);
                }
            
            }
        }
        return count;
    }

    /**
     * Flood Fill để đánh dấu một đảo
     *
     * @param grid ma trận 0/1
     * @param r    chỉ số hàng hiện tại
     * @param c    chỉ số cột hiện tại
     */
    private void dfs(int[][] grid, int r, int c) {
        int soHang = grid.length;
        int soCot = grid[0].length;
        if ( r <0 || c< 0 || r >= soHang || c >= soCot || grid[r][c] == 0) {
            return;
        }
        grid[r][c] = 0;
            dfs(grid, r-1, c);
            dfs(grid, r+1, c);
            dfs(grid ,r , c-1);
            dfs(grid, r, c+1);
        
    }
}