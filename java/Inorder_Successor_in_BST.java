public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        if(root == null || p == null) return null;
        if(p.right != null){
            TreeNode curr = p.right;
            while(curr.left != null) curr = curr.left;
            return curr;
        }else{
            TreeNode prev = null;//
            while(root != p){
                if( root.val > p.val){
                    prev = root;
                    root = root.left;
                }else if( root.val < p.val) root = root.right;
            }
            return prev;
        }
    }
}