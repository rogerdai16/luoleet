public class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) return 0;
        int rst = 0;
        // get the heighest index
        int max = 0;
        int maxHeight = height[0];
        for(int i = 1; i < height.length; i++){
            if(height[i] > maxHeight){
                maxHeight = height[i];
                max = i;
            }
        }
        // get from left
        maxHeight = height[0];
        for(int i = 0; i < max; i++){
            maxHeight = Math.max(maxHeight, height[i]);
            rst += maxHeight - height[i];
        }
        // get from right
        maxHeight = height[height.length - 1];
        for(int i = height.length - 1; i > max; i--){
            maxHeight = Math.max(maxHeight, height[i]);
            rst += maxHeight - height[i];
        }
        return rst;
    }
}