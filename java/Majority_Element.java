public class Solution {
    public int  major(int[] nums){
        if(nums == null || nums.length == 0) return -1;
        int major = nums[0], count = 0;
        for(int num : nums){
            if(count == 0) major = num;
            if(num == major) count++;
            else count--;
            
        }
        return major;
    }
}