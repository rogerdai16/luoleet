/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
 
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def deleteDuplicates(self, head):
        if(head is None):
            return head
        dummy = ListNode(-1)
        rst = dummy
        dummy.next = head
        while(head):
            if(head.val != dummy.next.val):
                dummy.next.next = head
                dummy = dummy.next
            head = head.next
        dummy.next.next = None
        return rst.next

 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode dummy = head;
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val != dummy.val){
                dummy.next = curr;
                dummy = dummy.next;
            }
            curr = curr.next;
        }
        dummy.next = null;
        return head;
    }
}