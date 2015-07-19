import java.util.Stack;

/**
 * Created by Qinghao on 7/19/2015.
 * Verify if a sequence of numbers can be a preorder traversal of a BST
 */
public class VerifyPreorder {
    public static boolean verifyPreorder(int[] arr){
        if(arr == null || arr.length == 0) return false;
        int root = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<Integer>();
        for(int i : arr){
            if(root != Integer.MIN_VALUE && i < root) return false;
            while(!st.isEmpty() && st.peek() < i) root = st.pop();
            st.push(i);
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(verifyPreorder(new int[]{5,2,1,3,8,6,9}));
        System.out.println(verifyPreorder(new int[]{3,4,5,1,2}));
    }
}
