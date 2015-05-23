public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null) return new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) + 1, i + 1};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}