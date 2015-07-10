public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(idx == 0 || nums[i] != nums[idx - 1]) nums[idx++] = nums[i];
        }
        return idx;
    }
}