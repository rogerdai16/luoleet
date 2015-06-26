public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m - 1][n - 1] == 1) return 0;
        int[][] matrix = new int[m][n];
        for(int i = m - 1; i >= 0; i--) if(obstacleGrid[i][n - 1] != 1) matrix[i][n - 1] = 1; else break;
        for(int i = n - 1; i >= 0; i--) if(obstacleGrid[m - 1][i] != 1) matrix[m - 1][i] = 1; else break;
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                if(obstacleGrid[i][j] != 1) matrix[i][j] = matrix[i + 1][j] + matrix[i][j+1];
            }
        }
        return matrix[0][0];
    }
}