public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int rst = 0;
        if(nums == null || nums.length < 3) return diff;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if( i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            int curr = nums[i];
            while(left < right){
                int gap = Math.abs(curr + nums[left] + nums[right] - target);
                if(gap < diff){
                    rst = curr + nums[left] + nums[right];
                    diff = gap;
                }
                if(curr + nums[left] + nums[right] < target){
                    left++;
                    while(nums[left] == nums[left - 1] && left < right)left++;
                }else if(curr + nums[left] + nums[right] > target){
                    right--;
                    while(nums[right] == nums[right + 1] && left < right) right--;
                }else if(curr + nums[left] + nums[right] == target){
                    left++;
                    right--;
                    while(nums[left] == nums[left - 1] && left < right)left++;
                    while(nums[right] == nums[right + 1] && left < right) right--;
                }
            }
        }
        return rst;
    }
}