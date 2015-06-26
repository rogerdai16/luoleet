class Solution {

	private TreeNode buildHelper(int[] preorder, int startP, int endP, int[] inorder, int startI, int endI) {
		if (startP > endP)return null;
		TreeNode curr = new TreeNode(preorder[startP]);
		int idx = startI; // root index in inorder traversal
		while (idx <= endI && inorder[idx] != preorder[startP])idx++;
		curr.left = buildHelper(preorder, startP + 1, startP + (idx - startI), inorder, startI, idx - 1);
		curr.right = buildHelper(preorder, startP + 1 + (idx - startI),	endP, inorder, idx + 1, endI);
		return curr;
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length != inorder.length) return null;
		return buildHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}
}
