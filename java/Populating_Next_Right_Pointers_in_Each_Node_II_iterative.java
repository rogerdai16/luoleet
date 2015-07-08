public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode dummy = new TreeLinkNode(-1);
        while(root != null){
            TreeLinkNode prev = dummy;
            prev.next = null;
            while(root!=null){
                if(root.left != null) { prev.next = root.left; prev = prev.next;}
                if(root.right != null) { prev.next = root.right; prev = prev.next;}
                root = root.next;
            }
            root = dummy.next;
        }
    }
}