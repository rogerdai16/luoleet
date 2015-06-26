public class Solution {
    private LinkedList<LinkedList<Integer>> rst = new LinkedList<LinkedList<Integer>>();
    
    private void pathSumHelper(TreeNode root, int sum, LinkedList<Integer> path){
        if(root == null) return;
        path.addLast(root.val);
        if(root.left == null && root.right == null && sum == root.val) rst.addLast(new LinkedList<Integer>(path));
        pathSumHelper(root.left, sum - root.val, path);
        pathSumHelper(root.right, sum - root.val, path);
        path.removeLast();
    }
    
    public LinkedList<LinkedList<Integer>> pathSum(TreeNode root, int sum) {
        LinkedList<Integer> path = new LinkedList<Integer>();
        pathSumHelper(root, sum, path);
        return this.rst;
    }
}