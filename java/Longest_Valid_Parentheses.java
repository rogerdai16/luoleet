public class Solution {
    private boolean match(int idx, char c, Stack<Integer> st){
        if(c == '('){
            st.push(idx);
            return true;
        }else{ // c == ')'
            if(st.size() == 0) return false;
            else{
                st.pop();
                return true;
            }
        }
    }
    public int longestValidParentheses(String s) {
        // pretty tricky one, push the index instead of character
        if(s == null || s.length() == 0) return 0;
        int start = -1;
        int rst = 0;
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < s.length(); i++){
            if(!match(i, s.charAt(i), st)) start = i;
            if(st.size() == 0)rst = Math.max(rst, i - start);
            else rst = Math.max(rst, i - st.peek());
        }
        return rst;
    }
}