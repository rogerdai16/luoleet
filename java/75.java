public class Solution {
    
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public void sortColors(int[] nums) {
        if(nums == null) return;
        int left = 0;
        int right = nums.length - 1;
        int i = left;
        while(i <= right){
            if(nums[i] == 0){
                swap(nums, i, left);
                left++;
                i++;
            }else if(nums[i] == 2){
                swap(nums, i, right);
                right--;
            }else{
                i++;
            }
        }
    }
}