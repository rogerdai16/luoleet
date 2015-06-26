public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null && l2 != null) return l2;
        if(l2 == null && l1 != null) return l1;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(l1 != null || l2 != null){
            int v1 = l1 == null? Integer.MAX_VALUE : l1.val;
            int v2 = l2 == null? Integer.MAX_VALUE : l2.val;
            if(v1 < v2){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = null;
        return dummy.next;
    }
}