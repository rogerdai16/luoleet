/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        
        int len = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        
        while(prev.next != null){
            len++;
            prev = prev.next;
        }
        
        k %= len;
        prev.next = head;
        
        prev = dummy;
        for(int i = 0 ; i < (len - k); i++) prev = prev.next;
        dummy.next = prev.next;
        prev.next = null;
        return dummy.next;
    }
}