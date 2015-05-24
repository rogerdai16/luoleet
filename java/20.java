public class Solution {
    public boolean isValid(String s) {
        if(s == null) return true;
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case ')':
                    if(st.size() == 0 || st.pop() != '(') return false; break;
                case '}':
                    if(st.size() == 0 || st.pop() != '{') return false; break;
                case ']':
                    if(st.size() == 0 || st.pop() != '[') return false; break;
                default:
                    st.push(s.charAt(i));
            }
        }
        return st.size() == 0? true : false;
    }
}