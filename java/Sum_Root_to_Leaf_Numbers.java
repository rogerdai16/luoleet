public class Solution {
    
    private int sumHelper(TreeNode root, int curr){
        if(root == null) return 0;
        curr = curr * 10 + root.val;
        if(root.left == null && root.right == null) return curr;
        return sumHelper(root.left, curr) + sumHelper(root.right, curr);
    }
    
    public int sumNumbers(TreeNode root) {
        return sumHelper(root, 0);
    }
}