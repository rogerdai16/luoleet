public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return head;
        // first copy current node to the next.
        RandomListNode curr = head;
        while(curr != null){
            RandomListNode next = new RandomListNode(curr.label);
            next.next = curr.next;
            curr.next = next;
            curr = curr.next.next;
        }
        // then set the random node's pointer to the random node
        curr = head;
        while(curr != null){
            if(curr.random != null) curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        // then split the new Node
        curr = new RandomListNode(-1);
        RandomListNode prev = curr;
        while(head != null){
            prev.next = head.next;
            prev = prev.next;
            head.next = head.next.next;
            head = head.next;
        }
        return curr.next;
    }
}