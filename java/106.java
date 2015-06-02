public class Solution {
    
    private TreeNode buildHelper(int[] inorder, int startI, int endI, int[] postorder, int startP, int endP){
        if(startI > endI) return null;
        TreeNode curr = new TreeNode(postorder[endP]);
        int idx = startI;
        while(idx <= endI && inorder[idx] != postorder[endP]) idx++;
        curr.left = buildHelper(inorder, startI, idx - 1, postorder, startP, startP + (idx - startI) - 1);
        curr.right = buildHelper(inorder, idx + 1, endI, postorder, startP + (idx - startI), endP - 1);
        return curr;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length) return null;
        return buildHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
}