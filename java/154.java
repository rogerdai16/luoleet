public class Solution {
    public int findMin(int[] nums) {
        int rst = Integer.MAX_VALUE;
        for(int i : nums) rst = Math.min(rst, i);
        return rst;
    }
}