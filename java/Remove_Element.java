public class Solution {
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public int removeElement(int[] nums, int val) {
        if(nums == null) return 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                swap(nums, i, j);
                j++;
            }
        }
        return j;
    }
}
// from end to start, a little difference
public class Solution {
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public int removeElement(int[] nums, int val) {
        if(nums == null) return 0;
        int j = 0;
        for(int i = nums.length - 1; i >= j; i--){
            if(nums[i] != val){
                swap(nums, i++, j);
                j++;
            }
        }
        return j;
    }
}