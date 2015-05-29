public class Solution {
    public int largestRectangleArea(int[] height) {
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
}