public class Solution {
	public class Range {
		int left;
		int right;
		public Range(int left, int right) {
			this.left = left;
			this.right = right;
		}
		public String toString() {
			if (left == right) {
				return Integer.toString(left);
			} else {
				return Integer.toString(left) + "->" + Integer.toString(right);
			}
		}
	}
	public List < String > findMissingRanges(int[] A, int lower, int upper) {
		List < String > result = new LinkedList < String > ();
		if (A.length == 0) {
			Range range = new Range(lower, upper);
			result.add(range.toString());
			return result;
		}

		if (A[0] > lower) {
			Range range = new Range(lower, A[0] - 1);
			result.add(range.toString());
		}

		int last = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > last + 1) {
				Range range = new Range(last + 1, A[i] - 1);
				result.add(range.toString());
			}
			last = A[i];
		}

		if (A[A.length - 1] < upper) {
			Range range = new Range(A[A.length - 1] + 1, upper);
			result.add(range.toString());
		}
		return result;
	}
}