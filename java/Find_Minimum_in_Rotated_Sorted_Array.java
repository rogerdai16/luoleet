public class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(right - left < 3) return Math.min(nums[left], Math.min(nums[mid], nums[right])); // minimum of these three
            if(nums[left] <= nums[mid]){
                if(nums[mid] > nums[right]) left = mid;
                else right = mid;
            }else{
                if(nums[mid] < nums[right]) right = mid;
                else left = mid;
            }
        }
        return nums[left];
    }
}