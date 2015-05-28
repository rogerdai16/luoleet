public class Solution {
    public void setZeroes(int[][] matrix) {
        // classical problem
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        boolean rowZero = false;
        boolean colZero = false;
        int m = matrix.length;
        int n = matrix[0].length;
        // special case
        if(matrix[0][0] == 0){
            rowZero = true;
            colZero = true;
        }
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 0)rowZero = true;
        }
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0)colZero = true;
        }
        // find
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                // if(matrix[0][j] == 0) continue;
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // set all rows to 0
        for(int i = 1; i < m; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < n; j++) matrix[i][j] = 0;
            }
        }
        for(int j = 1; j < n; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(rowZero){
            for(int j = 0; j < n; j++) matrix[0][j] = 0;
        }
        if(colZero){
            for(int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}