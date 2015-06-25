/**
 * Created by Qinghao on 6/24/2015.
 */
public class BST2DoubleList {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        TreeNode prev;
        TreeNode next;
        int val;
        public TreeNode(int v){
            val = v;
        }
    }

    // do the inorder traverse and link them
    private TreeNode prev = null;
    private TreeNode head = null;

    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev == null) {
            head = root;
        }else{
            prev.next = root;
            root.prev = prev;
        }
        prev = root;
        inorder(root.right);
    }

    public TreeNode convert(TreeNode root){
        inorder(root);
        if(head == null) return null;
        head.prev = prev;
        prev.next = head;
        return head;
    }

    public static void main(String[] args){
        BST2DoubleList me = new BST2DoubleList();
        TreeNode root = me.new TreeNode(2);
        root.left = me.new TreeNode(1);
        root.right = me.new TreeNode(3);
        root.left.right = me.new TreeNode(9);
        TreeNode head = me.convert(root);
    }
}
