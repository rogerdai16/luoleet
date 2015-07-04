/**
 * Created by Qinghao on 7/3/2015.
 * remove nodes that is not in the range[min, max]
 * ??? ?????????binary tree maximum path sum????
 */
public class RemoveRangeFromBST {

    static class TreeNode{
        TreeNode right;
        TreeNode left;
        int val;
        public TreeNode(int v){
            val = v;
        }
    }

    public static TreeNode removeRange(TreeNode root, int min, int max){
        if(root == null) return null;
        root.left = removeRange(root.left, min, max); // ???root.left????TreeNode
        root.right = removeRange(root.right, min, max); // ???root.right????TreeNode
        if(root.val < min){
            return root.right;
        }else if(root.val > max){
            return root.left;
        }else{
            return root;
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(removeRange(root, 2, 3).right.val);
    }

}
