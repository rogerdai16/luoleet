public class Solution {
    private boolean compareTwo(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return compareTwo(left.left, right.right) && compareTwo(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return compareTwo(root.left, root.right);
    }
}