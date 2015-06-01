/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /*
 class Solution:
    # @param root, a tree node
    # @return a list of integers
    def inorderTraversal(self, root):
        if(root is None):
            return []
        rst = []
        st = []
        curr = root
        while(st or curr):
            if(curr):
                st.append(curr)
                curr = curr.left
            else:
                curr = st.pop()
                rst.append(curr.val)
                curr = curr.right
        return rst
 */
public class Solution {
    public LinkedList<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> rst = new LinkedList<Integer>();
        if(root == null) return rst;
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root;
        while(root != null || st.size() > 0){
            if(root != null){
                st.push(root);
                root = root.left;
            }else{
                root = st.pop();
                rst.addLast(root.val);
                root = root.right;
            }
        }
        return rst;
    }
}