public class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null) return;
        while(node.next.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}