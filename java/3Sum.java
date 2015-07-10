public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rst = new LinkedList<List<Integer>>();
        if(nums == null || nums.length < 3) return rst;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if( i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            int curr = nums[i];
            while(left < right){
                if(curr + nums[left] + nums[right] == 0){
                    LinkedList<Integer> tmp = new LinkedList<Integer>();
                    tmp.add(curr);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    rst.add(tmp);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1])left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }else if(curr + nums[left] + nums[right] < 0){
                    left++;
                    while(nums[left] == nums[left - 1] && left < right)left++;
                }else if(curr + nums[left] + nums[right] > 0){
                    right--;
                    while(nums[right] == nums[right + 1] && left < right) right--;
                }
            }
        }
        return rst;
    }
}