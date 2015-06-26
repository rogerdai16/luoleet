public class Solution {
    public int maxArea(int[] height) {
        if(height == null) return 0;
        int rst = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int curr = (right - left) * Math.min(height[right], height[left]);
            rst = Math.max(rst, curr);
            if(height[left] <= height[right]) left++;
            else right--;
        }
        return rst;
    }
}