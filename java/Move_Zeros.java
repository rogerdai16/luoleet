public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int i = 0;
        for(int idx = 0;idx < nums.length; idx++){
            if(nums[idx] != 0) nums[i++] = nums[idx];
        }
        while(i < nums.length) nums[i++] = 0;
    }
}