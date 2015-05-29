public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(head != null){
            if(head.next == null || head.val != head.next.val){
                prev.next = head;
                prev = prev.next;
            }else{
                while(head.next != null && head.val == head.next.val) head = head.next;
            }
            head = head.next;
        }
        prev.next = null;
        return dummy.next;
    }
}