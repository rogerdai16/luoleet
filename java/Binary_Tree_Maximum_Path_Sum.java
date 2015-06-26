public class Solution {
    private int rst = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root){
        maxPathSumHelper(root);
        return rst;
    }
    
    public int maxPathSumHelper(TreeNode root) {
        if(root == null) return 0;
        int left = maxPathSumHelper(root.left);
        int right = maxPathSumHelper(root.right);
        int curr = root.val;
        if(left > 0) curr += left;
        if(right > 0) curr += right;
        rst = Math.max(rst, curr);
        return Math.max(root.val, root.val + Math.max(left, right));
    }
}