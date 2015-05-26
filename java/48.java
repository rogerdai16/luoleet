public class Solution {
    
    private void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    
    
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i = 0; i < n; i++)reverse(matrix[i]);
    }
}