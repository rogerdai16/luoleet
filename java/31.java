public class Solution {
    
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    private void reverse(int[] nums, int left, int right){
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        // this is a pretty tricky one
        if(nums == null || nums.length < 1) return;
        // from right to left, find the first that violates the increasing trend index
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1])i--;
        // from right to left, find the first that is larger than i
        if(i >= 0){
            int j = nums.length - 1;
            while(j >= 0 && nums[j] <= nums[i])j--;
            swap(nums, i, j);
        }
        // reverse
        reverse(nums, i + 1, nums.length - 1);
    }
}