public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) right = mid -1;
            else left = mid + 1;
        }
        if(nums[left] < target) return left + 1;
        else return left;
    }
}