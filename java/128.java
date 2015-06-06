public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int rst = 0;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i : nums) map.put(i, false);
        for(int i : nums){
            if(map.get(i) == true) continue;
            int upper = i + 1;
            while(map.containsKey(upper) && map.get(upper) == false){
                map.put(upper, true);
                upper++;
            }
            int lower = i - 1;
            while(map.containsKey(lower) && map.get(lower) == false){
                map.put(lower, true);
                lower--;
            }
            rst = Math.max(rst, upper - lower - 1);
            map.put(i, true);
        }
        return rst;
    }
}