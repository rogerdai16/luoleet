public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null || k <= 0) return -1;
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root;
        while(st.size() != 0 || curr != null){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }else{
                curr = st.pop();
                k--;
                if(k == 0) return curr.val;
                curr = curr.right;
            }
        }
        return -1;
    }
}