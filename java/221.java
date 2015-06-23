public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int len = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] -= '0';
                if(i > 0 && j > 0 && matrix[i][j] == 1){
                    matrix[i][j] += Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]);
                }
                len = Math.max(len, matrix[i][j]);
            }
        }
        return (int)Math.pow(len, 2);
    }
}