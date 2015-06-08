public class Solution {
    
    private TreeNode first;
    private TreeNode second;
    private TreeNode prev;
    
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        recoverTreeHelper(root);
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }
    
    private void recoverTreeHelper(TreeNode root) {
        if(root == null) return;
        // do the in order traversal, here is recursively
        recoverTreeHelper(root.left);
        if(prev != null && prev.val > root.val){
            if(first == null) first = prev;
            second = root;
        }
        prev = root;
        recoverTreeHelper(root.right);
    }
}