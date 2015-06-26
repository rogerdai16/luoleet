 /*
 class Solution:
    # @param root, a tree node
    # @return nothing
    def connect(self, root):
        if(root is None):
            return
        dummy = TreeNode(-1)
        dummy.next = None
        pre = dummy
        while(root):
            if(root.left):
                pre.next = root.left
                pre = pre.next
            if(root.right):
                pre.next = root.right
                pre = pre.next
            root = root.next
        self.connect(dummy.next)
 
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
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