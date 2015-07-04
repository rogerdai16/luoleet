import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * Created by Qinghao on 7/3/2015.
 * print all paths from root to leaf
 */
public class PrintPathFromRoot2Leaf {

    static class TreeNode{
        TreeNode right;
        TreeNode left;
        int val;
        public TreeNode(int v){
            val = v;
        }
    }

    private static void root2LeafHelper(TreeNode root, LinkedList<TreeNode> path){
        path.addLast(root);
        if(root.left != null) root2LeafHelper(root.left, path);
        if(root.right != null) root2LeafHelper(root.right, path);
        if(root.left == null && root.right == null){
            for(TreeNode t : path) System.out.println(t.val);
            System.out.println("-------------");
        }
        path.pollLast();
    }

    public static void root2Leaf(TreeNode root){
        if(root == null) return;
        LinkedList<TreeNode> path = new LinkedList<TreeNode>();
        root2LeafHelper(root, path);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(7);
        root2Leaf(root);
    }

}
