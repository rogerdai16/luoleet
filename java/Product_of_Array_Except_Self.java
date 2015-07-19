public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        int[] rst = new int[nums.length];
        rst[0] = 1;
        for(int i = 1; i < nums.length; i++) rst[i] = nums[i - 1] * rst[i - 1];
        int left = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 1; i--){
            rst[i] = rst[i] * left;
            left *= nums[i];
        }
        rst[0] = left;
        return rst;
    }
}