public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null && fast != slow){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        return fast == slow? true : false;
    }
}