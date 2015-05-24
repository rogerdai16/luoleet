/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode tmp = head;
        for(int i = 0; i < n; i++) tmp = tmp.next;
        while(tmp != null){
            tmp = tmp.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }
}