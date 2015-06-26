/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next != null && prev.next.next != null){
            ListNode tmp = prev.next.next.next;
            prev.next.next.next = prev.next;
            prev.next = prev.next.next;
            prev.next.next.next = tmp;
            prev = prev.next.next;
        }
        return dummy.next;
    }
}