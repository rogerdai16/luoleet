import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Qinghao on 7/9/2015.
 * Sink Zero in Binary Tree. Swap zero value of a node with non-zero value of one of its descendants
 * so that no node with value zero could be parent of node with non-zero.
 *
 * Solution: use stack to do the post-order traversal (prunning with only non-leaf nodes). And for each node, do the the operation like heapify
 */
public class SinkZero {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int v){
            val = v;
        }
    }

    private static boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }

    public static void sinkZero(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> st = new Stack<TreeNode>();
        Stack<TreeNode> result = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(!isLeaf(curr))result.push(curr);
            if(curr.left != null) st.push(curr.left);
            if(curr.right != null) st.push(curr.right);
        }
        while(!result.isEmpty()){
            TreeNode curr = result.pop();
            System.out.println("now visiting " + curr.val);
            sinkHelper(curr);
        }
    }

    private static void sinkHelper(TreeNode node) {
        if(node == null || node.val != 0) return;
        if(node.left != null && node.left.val != 0){
            int tmp = node.val;
            node.val = node.left.val;
            node.left.val = tmp;
            sinkHelper(node.left);
        }else if(node.right != null && node.right.val != 0){
            int tmp = node.val;
            node.val = node.right.val;
            node.right.val = tmp;
            sinkHelper(node.right);
        }
    }


    public static void main(String[] args){
        SinkZero me = new SinkZero();
        TreeNode root = me.new TreeNode(0);
        root.left = me.new TreeNode(0);
        root.right = me.new TreeNode(0);
        root.right.left = me.new TreeNode(0);
        root.right.left.right = me.new TreeNode(1);
        sinkZero(root);
        levelPrint(root);
    }

    private static void levelPrint(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Queue<TreeNode> next = new LinkedList<TreeNode>();
            while(!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                System.out.print(curr.val + "  ");
                if (curr.left != null) next.offer(curr.left);
                if (curr.right != null) next.offer(curr.right);
            }
            System.out.println();
            queue = next;
        }
    }

}
