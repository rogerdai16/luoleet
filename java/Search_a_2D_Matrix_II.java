public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int currX = 0;
        int currY = n - 1;
        while(currX >= 0 && currX < m && currY >= 0 && currY < n){
            if(matrix[currX][currY] == target) return true;
            else if(matrix[currX][currY] > target) currY--;
            else if(matrix[currX][currY] < target) currX++;
        }
        return false;
    }
}