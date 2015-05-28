public class Solution {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0) return "/";
        LinkedList<String> st = new LinkedList<String>();
        String[] folders = path.split("[/]+");
        for(String f : folders){
            if(f.equals("..")){
                if(st.size() > 0) st.removeLast();
            }else if(!f.equals(".") && f.length() > 0){
                st.addLast(f);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append("/");
            sb.append(st.pollFirst());
        }
        if(sb.length() == 0) sb.append("/");
        return sb.toString();
    }
}