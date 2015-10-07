public class Solution {
    public int closestValue(TreeNode root, double target){
        if(root == null) return -1;
        int rst = root.val;
        double gap = Math.abs(root.val - target);
        while(root != null){
            if(Math.abs(root.val - target) < Math.abs(rst - target)){
                rst = root.val;
                gap = Math.abs(root.val - target);
            }
            if(target < root.val) root = root.left;
            else root = root.right;
        }
        return rst;
    }
}