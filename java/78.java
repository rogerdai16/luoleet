public class Solution {
    
    private void dfs(LinkedList<Integer> path, int[] nums, int level, LinkedList<LinkedList<Integer>> rst){
        if(level == nums.length){
            rst.add(new LinkedList<Integer>(path));
            return;
        }
        dfs(path, nums, level + 1, rst);
        path.addLast(nums[level]);
        dfs(path, nums, level + 1, rst);
        path.removeLast();
    }
    
    
    
    public LinkedList<LinkedList<Integer>> subsets(int[] nums) {
        LinkedList<LinkedList<Integer>> rst = new LinkedList<LinkedList<Integer>>();
        LinkedList<Integer> path = new LinkedList<Integer>();
        if(nums == null || nums.length == 0) return rst;
        Arrays.sort(nums);
        dfs(path, nums, 0, rst);
        return rst;
    }
}