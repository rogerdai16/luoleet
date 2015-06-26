public class Solution {
    public int[][] generateMatrix(int n) {
        if(n < 0) return null;
        int[][] rst = new int[n][n];
        int counter = 1;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            // up
            for(int i = start; i <= end; i++) rst[start][i] = counter++;
            
            // right
            for(int i = start + 1; i <= end; i++) rst[i][end]=counter++;
        
            // bottom
            for(int i = end - 1; i >= start; i--) rst[end][i]=counter++;
         
            // left
            for(int i = end - 1; i >= start + 1; i--) rst[i][start]=counter++;
            
            start++;
            end--;
        }
        return rst;
    }
}