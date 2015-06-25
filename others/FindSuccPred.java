/**
 * Created by Qinghao on 6/25/2015.
 */
public class FindSuccPred {
    // find the successor and predecessor of Node in BST. (with parents)
    class TreeNode {
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        int val;

        public TreeNode(int v) {
            val = v;
        }
    }

    public TreeNode findSucc(TreeNode node){
        if(node == null) return null;
        if(node.right != null){
            node = node.right;
            while(node.left != null) node = node.left;
            return node;
        }else{
            TreeNode parent = node.parent;
            while(parent != null && node == parent.right){
                parent = parent.parent;
                node = node.parent;
            }
            return parent;
        }
    }

    public TreeNode findPred(TreeNode node){
        if(node == null) return null;
        if(node.left != null){
            node = node.left;
            while(node.right != null) node = node.right;
            return node;
        }else{
            TreeNode parent = node.parent;
            while(parent != null && node == parent.left){
                parent = parent.parent;
                node = node.parent;
            }
            return parent;
        }
    }

}
