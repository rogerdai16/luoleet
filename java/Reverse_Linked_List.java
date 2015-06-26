public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        while(head.next != null){
            ListNode tmp = dummy.next;
            dummy.next = head.next;
            head.next = head.next.next;
            dummy.next.next = tmp;
        }
        return dummy.next;
    }
}