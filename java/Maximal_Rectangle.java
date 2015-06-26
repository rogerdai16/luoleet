public class Solution {
    
    private int largestRectangleArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        Stack<Integer> st = new Stack<Integer>();
        int rst = 0;
        for(int i = 0 ; i <= height.length; i++){
            int curr = i == height.length? -1 : height[i];
            while(st.size() > 0 && curr <= height[st.peek()]){
                int h = height[st.pop()];
                int w = st.size() > 0? i - st.peek() - 1 : i;
                rst = Math.max(rst, h * w);
            }
            st.push(i);
        }
        return rst;
    }    
    
    private int[][] preProcess(char[][] matrix){
        int[][] rst = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                rst[i][j] = (int)(matrix[i][j] - '0');
            }
        }
        return rst;
    }
    
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int[][] intMatrix = preProcess(matrix);
        int[][] subRst = new int[matrix.length][matrix[0].length];
        int rst = 0;
        subRst[0] = intMatrix[0]; // copy of first row
        for(int i = 0; i < intMatrix.length; i++){
            if(i > 0){
                for(int j = 0; j < intMatrix[0].length; j++){
                    if(intMatrix[i][j] != 0) subRst[i][j] = subRst[i - 1][j] + 1;
                }
            }
            rst = Math.max(rst, largestRectangleArea(subRst[i]));
        }
        return rst;
    }
}