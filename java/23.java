public class Solution {

	private PriorityQueue < ListNode > pq = null;

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		this.pq = new PriorityQueue < ListNode > (lists.length, new Comparator < ListNode > () {@Override
			public int compare(ListNode arg0, ListNode arg1) {
				if (arg0.val > arg1.val) return 1;
				if (arg0.val < arg1.val) return -1;
				return 0;
			}
		});
		ListNode dummy = new ListNode(-1);
		ListNode prev = dummy;
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				pq.offer(lists[i]);
			}
		}
		while (pq.size() > 0) {
			ListNode curr = pq.poll();
			prev.next = curr;
			prev = prev.next;
			if (curr.next != null) pq.offer(curr.next);
		}
		return dummy.next;
	}
}