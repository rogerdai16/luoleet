public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = 0;
        long sum = 0;
        int rst = nums.length + 1; // may be overflow
        while(right < nums.length){
            sum += nums[right];
            while(left <= right && sum >= s){
                sum -= nums[left];
                rst = Math.min(rst, right - left + 1);
                left++;
            }
            right++;
        }
        return rst == nums.length + 1? 0 : rst;
    }
}