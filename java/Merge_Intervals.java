public class Solution {
	public LinkedList < Interval > merge(List < Interval > intervals) {
		LinkedList < Interval > rst = new LinkedList < Interval > ();
		if (intervals == null || intervals.size() == 0) return rst;
		// sort it
		PriorityQueue < Interval > pq = new PriorityQueue < Interval > (intervals.size(), new Comparator < Interval > () {@Override
			public int compare(Interval arg0, Interval arg1) {
				if (arg0.start > arg1.start) return 1;
				if (arg0.start < arg1.start) return -1;
				return 0;
			}
		});
		for (Interval i: intervals) if (i != null) pq.offer(i);
		while (pq.size() > 0) {
			Interval i = pq.poll();
			if (rst.size() == 0 || i.start > rst.peekLast().end) {
				rst.add(i);
			} else {
				rst.peekLast().end = Math.max(rst.peekLast().end, i.end);
			}
		}
		return rst;
	}
}
