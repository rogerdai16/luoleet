public class Solution {
    
    private ListNode merge(ListNode first, ListNode second){
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(first != null || second != null){
            if(first == null){
                prev.next = second;
                second = second.next;
            }else if(second == null){
                prev.next = first;
                first = first.next;
            }else{
                ListNode next = first.val <= second.val? first : second;
                prev.next = next;
                first = next == first? first.next : first;
                second = next == second? second.next : second;
            }
            prev = prev.next;
        }
        prev.next = null;
        return dummy.next;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        ListNode first = sortList(head);
        ListNode second = sortList(newHead);
        return merge(first, second);
    }
}