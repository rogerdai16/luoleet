public class Solution {
    public LinkedList<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> rst = new LinkedList<Integer>();
        if(root == null) return rst;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(st.size() > 0){
            TreeNode curr = st.pop();
            rst.addLast(curr.val);
            if(curr.left != null) st.push(curr.left);
            if(curr.right != null) st.push(curr.right);
        }
        Collections.reverse(rst);
        return rst;
    }
}