public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int v1 = l1 == null? 0 : l1.val;
            int v2 = l2 == null? 0 : l2.val;
            l1 = l1 == null? l1 : l1.next;
            l2 = l2 == null? l2 : l2.next;
            prev.next = new ListNode((v1 + v2 + carry) % 10);
            prev = prev.next;
            carry = (v1 + v2 + carry) / 10;
        }
        return dummy.next;
    }
}