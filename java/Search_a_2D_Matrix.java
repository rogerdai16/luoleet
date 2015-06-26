public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n;
        while(left < right){
            int mid = left + (right - left) / 2;
            int row = mid / n;
            int column = mid % n;
            if(matrix[row][column] == target) return true;
            if(matrix[row][column] < target) left = mid + 1;
            else right = mid;
        }
        return false;
    }
}