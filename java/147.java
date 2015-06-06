public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode prev;
        while(head != null){
            prev = dummy;
            while(prev.next != null && prev.next.val < head.val) prev = prev.next;
            ListNode tmp = prev.next;
            prev.next = head;
            head = head.next;
            prev.next.next = tmp;
        }
        return dummy.next;
    }
}