public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        TreeLinkNode dummy = new TreeLinkNode(-1);
        TreeLinkNode prev = dummy;
        while(root != null){
            if(root.left != null){
                prev.next = root.left;
                prev = prev.next;
            }
            if(root.right != null){
                prev.next = root.right;
                prev = prev.next;
            }
            root = root.next;
        }
        connect(dummy.next);
    }
}