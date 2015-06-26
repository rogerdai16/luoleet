public class Solution {
    
	private void reverse(ListNode first, ListNode second){
		ListNode curr = first.next;
		ListNode end = second.next;
		while(first.next != end){
			ListNode tmp = first.next;
			first.next = curr.next;
			curr.next = curr.next.next;
			first.next.next = tmp;
		}
	}
	
    public ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null) return head;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode first = dummy;
		for(int i = 1; i < m; i++) first = first.next;
		ListNode second = first;
		for(int i = m; i < n; i++) second = second.next;
		reverse(first, second);
		return dummy.next;
    }
}