/**
 * Created by Qinghao on 7/4/2015.
 * Insert an element into circular sorted doublely linked list
 */
public class InsertCircularDoublelyLinkedList {

    static class ListNode{
        ListNode prev;
        ListNode next;
        int val;
        public ListNode(int v){
            val = v;
        }
    }

    public static ListNode insertNode(ListNode head, int v){
        if(head == null) return head;
        ListNode end = head.prev;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        while(dummy.next.val < v && dummy != end) dummy = dummy.next;
        ListNode tmp = dummy.next.prev;
        dummy.next.prev = new ListNode(v);
        dummy.next.prev.next = dummy.next;
        dummy.next.prev.prev = tmp;
        tmp.next = dummy.next.prev;
        return dummy.next == head? dummy.next.prev : head;
    }

    public static void main(String[] args){
        ListNode one = new ListNode(1);
        one.next = new ListNode(2);
        one.next.prev = one;
        one.next.next = new ListNode(4);
        one.next.next.prev = one.next;
        one.next.next.next = one;
        one.prev = one.next.next; // 1 - 2 - 4
        ListNode head = one;
        head = insertNode(head, 1);
        for(int i = 0; i < 8; i++) {
            System.out.println(head.val);
            head = head.next;
        }
    }



}
