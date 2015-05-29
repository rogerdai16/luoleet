/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 /*
 
class Solution:
    # @param head, a ListNode
    # @param x, an integer
    # @return a ListNode
    def partition(self, head, x):
        first = ListNode(-1)
        second = ListNode(-1)
        first_prev = first
        second_prev= second
        while(head):
            if(head.val < x):
                first_prev.next = head
                first_prev = first_prev.next
            else:
                second_prev.next = head
                second_prev = second_prev.next
            head = head.next
        first_prev.next = second.next
        second_prev.next = None
        return first.next
 
 */
 
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return head;
        ListNode first = new ListNode(-1);
        ListNode second = new ListNode(-1);
        ListNode second_prev = second;
        ListNode first_prev = first;
        while(head != null){
            if(head.val < x){
                first_prev.next = head;
                first_prev = first_prev.next;
            }else{
                second_prev.next = head;
                second_prev = second_prev.next;
            }
            head = head.next;
        }
        second_prev.next = null;
        first_prev.next = second.next;
        return first.next;
    }
}