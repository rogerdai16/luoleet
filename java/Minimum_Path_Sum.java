public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] rst = new int[m][n];
        rst[m - 1][n - 1] = grid[m - 1][n - 1];
        
        for(int i = m - 2; i >= 0; i--) rst[i][n - 1] = rst[i + 1][n - 1] + grid[i][n - 1];
        for(int i = n - 2; i >= 0; i--) rst[m - 1][i] = rst[m - 1][i + 1] + grid[m - 1][i];
        
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                rst[i][j] = Math.min(rst[i + 1][j], rst[i][j + 1]) + grid[i][j];
            }
        }
        return rst[0][0];
    }
}