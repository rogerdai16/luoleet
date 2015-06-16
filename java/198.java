public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int pre_pre = 0;
        int pre = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tmp = pre;
            pre = Math.max(pre, pre_pre + nums[i]);
            pre_pre = tmp;
        }
        return pre;
    }
}