public class Solution {
    
    private boolean getPath(TreeNode root, TreeNode target, LinkedList<TreeNode> path){
        path.addLast(root);
        if(root == target) return true;
        if(root.left != null && getPath(root.left, target, path)) return true;
        if(root.right != null && getPath(root.right, target, path)) return true;
        path.pollLast();
        return false;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        LinkedList<TreeNode> path1 = new LinkedList<TreeNode>();
        getPath(root, p, path1);
        LinkedList<TreeNode> path2 = new LinkedList<TreeNode>();
        getPath(root, q, path2);
        Iterator<TreeNode> iter1 = path1.iterator();
        Iterator<TreeNode> iter2 = path2.iterator();
        TreeNode prev = root;
        while(iter1.hasNext() && iter2.hasNext()){
            TreeNode node1 = iter1.next();
            TreeNode node2 = iter2.next();
            if(node1 != node2) return prev;
            else prev = node1;
        }
        return prev;
    }
}