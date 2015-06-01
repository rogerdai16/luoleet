public class Solution {

	private LinkedList < TreeNode > generate(int start, int end) {
		LinkedList < TreeNode > rst = new LinkedList < TreeNode > ();
		if (start > end) {
			rst.addLast(null);
			return rst;
		}
		for (int k = start; k <= end; k++) {
			LinkedList < TreeNode > leftSubTrees = generate(start, k - 1);
			LinkedList < TreeNode > rightSubTrees = generate(k + 1, end);
			for (TreeNode left: leftSubTrees) {
				for (TreeNode right: rightSubTrees) {
					TreeNode curr = new TreeNode(k);
					curr.left = left;
					curr.right = right;
					rst.addLast(curr);
				}
			}
		}
		return rst;
	}


	public LinkedList < TreeNode > generateTrees(int n) {
		if (n <= 0) return generate(1, n);
		return generate(1, n);
	}
}
