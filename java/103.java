public class Solution {
    public LinkedList<LinkedList<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<LinkedList<Integer>> rst = new LinkedList<LinkedList<Integer>>();
        if(root == null) return rst;
        Stack<TreeNode> level = new Stack<TreeNode>();
        level.push(root);
        boolean order = false;
        while(level.size() > 0){
            LinkedList<Integer> curr = new LinkedList<Integer>();
            Stack<TreeNode> next = new Stack<TreeNode>();
            while(level.size() > 0){
                TreeNode t = level.pop();
                curr.addLast(t.val);
                if(order == false){
                    if(t.left != null) next.push(t.left);
                    if(t.right != null) next.push(t.right);
                }else{
                    if(t.right != null) next.push(t.right);
                    if(t.left != null) next.push(t.left);                    
                }
            }
            order = !order;
            rst.addLast(curr);
            level = next;
        }
        return rst;
    }
}