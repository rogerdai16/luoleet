public class Solution {
    
    private ListNode reverse(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        while(head.next != null){
            ListNode tmp = dummy.next;
            dummy.next = head.next;
            head.next= head.next.next;
            dummy.next.next = tmp;
        }
        return dummy.next;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = reverse(slow.next);
        slow.next = null;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(head != null || newHead != null){
            prev.next = head != null? head : prev.next;
            head = head != null? head.next : head;
            prev = prev.next == null? prev : prev.next;

            prev.next = newHead != null? newHead : prev.next;
            newHead = newHead != null? newHead.next : newHead;
            prev = prev.next == null? prev : prev.next;
        }
    }
}