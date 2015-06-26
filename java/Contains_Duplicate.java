public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        BitSet pos = new BitSet();
        BitSet neg = new BitSet();
        boolean negInf = false;
        for(int i : nums){
            if(i == Integer.MIN_VALUE){
                if(negInf) return true;
                else negInf = true;
            }else if(i >= 0){
                if(pos.get(i)) return true;
                else pos.set(i);
            }else if(i < 0){
                if(neg.get(-i)) return true;
                else pos.set(-i);
            }
        }
        return false;
    }
}