public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        do{
            fast = fast.next.next;
            slow = slow.next;
        }while(fast != null && fast.next != null && fast != slow);
        return fast == slow? true : false;
    }
}
