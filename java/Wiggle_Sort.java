public class Solution {
    public void wiggleSort(int[] nums) {
        if(nums == null || nums.length == 0) return;
        for(int i = 0; i < nums.length; i += 2){
            if(i > 0 && nums[i - 1] < nums[i]) swap(nums, i - 1, i);
            if(i < nums.length - 1 && nums[i] > nums[i + 1]) swap(nums, i, i + 1);
        }
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}