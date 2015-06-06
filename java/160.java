public class Solution {
    private int getLength(ListNode head){
        int rst = 0;
        while(head != null){
            rst++;
            head = head.next;
        }
        return rst;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        ListNode longer = new ListNode(-1);
        ListNode shorter = new ListNode(-1);
        longer.next = lengthA >= lengthB? headA : headB;
        shorter.next = lengthA < lengthB? headA : headB;
        int LONG = lengthA >= lengthB? lengthA : lengthB;
        int SHORT = lengthA < lengthB? lengthA : lengthB;
        while(LONG > SHORT){
            longer = longer.next;
            LONG--;
        }
        while(longer.next != shorter.next){
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer.next;
    }
}