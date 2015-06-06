public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        Stack<Integer> st = new Stack<Integer>(); // possible bug, overflow
        for(String t : tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int second = st.pop();
                int first = st.pop();
                if(t.equals("+")){
                    st.push(first + second);
                }else if(t.equals("-")){
                    st.push(first - second);
                }else if(t.equals("*")){
                    st.push(first * second);
                }else if(t.equals("/")){
                    st.push(first / second);
                }
            }else{
                st.push(Integer.valueOf(t));
            }
        }
        return st.pop();
    }
}