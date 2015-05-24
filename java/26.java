public class Solution {
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1) return 0;
        if(nums.length == 1) return 1;
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[j - 1]){
                swap(nums, i, j);
                j++;
            }
        }
        return j;
    }
}