public class Solution {
    
    private TreeNode buildHelper(int[] nums, int start, int end){
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = buildHelper(nums, start, mid - 1);
        curr.right = buildHelper(nums, mid + 1, end);
        return curr;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;
        return buildHelper(nums, 0, nums.length - 1);
    }
}