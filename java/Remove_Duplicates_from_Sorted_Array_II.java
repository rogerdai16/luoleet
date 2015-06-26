public class Solution {
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        if(nums.length < 3) return nums.length;
        int j = 2;
        for(int i = j; i < nums.length; i++){
            if(nums[j - 1] != nums[j - 2] || (nums[j - 1] == nums[j - 2] && nums[i] != nums[j - 1])){
                swap(nums, i, j);
                j++;
            }
        }
        return j;
    }
}