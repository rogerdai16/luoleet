public class Solution {
    
    private ListNode head = null;
    
    private TreeNode buildHelper(int start, int end){
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode left = buildHelper(start, mid - 1);
        TreeNode curr = new TreeNode(head.val);
        head = head.next;
        curr.left = left;
        curr.right = buildHelper(mid + 1, end);
        return curr;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode prev = head;
        int len = 1;
        while(prev.next != null){
            prev = prev.next;
            len++;
        }
        this.head = head;
        return buildHelper(0, len - 1);
    }
}