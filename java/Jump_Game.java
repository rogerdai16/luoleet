public class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        int max = nums[0];
        for(int i = 0; i <= max; i++){
            max = Math.max(max, i + nums[i]);
            if(max >= nums.length - 1) return true;
        }
        return false;
    }
}