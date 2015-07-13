public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        while(root != null){
            if(root.val < Math.min(p.val, q.val)){
                root = root.right;
            }else if(root.val > Math.max(p.val, q.val)){
                root = root.left;
            }else{
                return root;
            }
        }
        return null;
    }
}