public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rst = new LinkedList<String>();
        if(nums == null || nums.length == 0) return rst;
        int last = nums[0];
        int start = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == last + 1)last = nums[i];
            else{
                if(start != last) rst.add(String.valueOf(start) + "->" + String.valueOf(last));
                else rst.add(String.valueOf(start));
                start = nums[i];
                last = nums[i];
            }
        }
        if(start != last) rst.add(String.valueOf(start) + "->" + String.valueOf(last));
        else rst.add(String.valueOf(start));
        return rst;
    }
}