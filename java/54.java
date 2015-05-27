public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return rst;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int startX = 0;
        int endX = m - 1;
        
        int startY = 0;
        int endY = n - 1;
        
        while(true){
            // up
            for(int i = startY; i <= endY; i++) rst.add(matrix[startX][i]);
            if(++startX > endX) break;
            
            // right
            for(int i = startX; i <= endX; i++) rst.add(matrix[i][endY]);
            if(--endY < startY) break;
            
            // bottom
            for(int i = endY; i >= startY; i--) rst.add(matrix[endX][i]);
            if(--endX < startX) break;
            
            // left
            for(int i = endX; i >= startX; i--) rst.add(matrix[i][startY]);
            if(++startY > endY) break;
            
        }
        return rst;
    }
}