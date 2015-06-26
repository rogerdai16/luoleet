public class Solution {
    public LinkedList<LinkedList<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<LinkedList<Integer>> rst = new LinkedList<LinkedList<Integer>>();
        if(root == null) return rst;
        LinkedList<TreeNode> level = new LinkedList<TreeNode>();
        level.addLast(root);
        while(level.size() > 0){
            LinkedList<Integer> curr = new LinkedList<Integer>();
            LinkedList<TreeNode> next = new LinkedList<TreeNode>();
            for(TreeNode t : level){
                curr.addLast(t.val);
                if(t.left != null) next.addLast(t.left);
                if(t.right != null) next.addLast(t.right);
            }
            rst.addLast(curr);
            level = next;
        }
        Collections.reverse(rst);
        return rst;
    }
}