public class BSTIterator {
    
    private Stack<TreeNode> st = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        while(root != null){
            st.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return st.size() != 0;
    }

    /** @return the next smallest number */
    public int next() {
        if(hasNext()){
            TreeNode curr = st.pop();
            TreeNode right = curr.right;
            while(right != null){
                st.push(right);
                right = right.left;
            }
            return curr.val;
        }
        return -1;
    }
}