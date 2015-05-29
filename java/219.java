public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return false;
        HashSet<Integer> hs = new HashSet<Integer>();
        int i = 0;
        while(i < Math.min(k + 1, nums.length)){
            if(!hs.contains(nums[i])) hs.add(nums[i]);
            else return true;
            i++;
        }
        int left = 0;
        while(i < nums.length){
            hs.remove(nums[left]);
            left++;
            if(!hs.contains(nums[i])) hs.add(nums[i]);
            else return true;
            i++;
        }
        return false;
    }
}