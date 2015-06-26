public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = nums[0];
        int rst = nums[0];
        for(int i = 1; i < nums.length; i++){
            rst = Math.max(rst, max);
            max = Math.max(max + nums[i], nums[i]);
        }
        return Math.max(rst, max);
    }
}