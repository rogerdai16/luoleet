public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = nums[0];
        int min = nums[0];
        int rst = nums[0];
        for(int i = 1; i < nums.length; i++){
            int currMax = Math.max(Math.max(nums[i], max * nums[i]), min * nums[i]);
            int currMin = Math.min(Math.min(nums[i], max * nums[i]), min * nums[i]);
            max = Math.max(currMax, currMin);
            min = Math.min(currMax, currMin);
            rst = Math.max(rst, max);
        }
        return rst;
    }
}