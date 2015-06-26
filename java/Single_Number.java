public class Solution {
    public int singleNumber(int[] nums) {
        int rst = 0;
        for(int n : nums) rst ^= n;
        return rst;
    }
}