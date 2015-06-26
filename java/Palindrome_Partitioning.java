public class Solution {

    private boolean isPalindrome(String s, int start, int end){
        while(start <= end && s.charAt(start) == s.charAt(end)){
            start++;
            end--;
        }
        return start > end;
    }
    
    private void dfs(LinkedList<String> path, String s, int idx, LinkedList<LinkedList<String>> rst){
        if(idx >= s.length()){
            rst.addLast(new LinkedList<String>(path));
            return;
        }
        for(int i = idx; i < s.length(); i++){
            if(isPalindrome(s, idx, i)){
                path.addLast(s.substring(idx, i + 1));
                dfs(path, s, i + 1, rst);
                path.removeLast();
            }
        }
    }

    public LinkedList<LinkedList<String>> partition(String s) {
        LinkedList<LinkedList<String>> rst = new LinkedList<LinkedList<String>>();
        if(s == null) return rst;
        LinkedList<String> path = new LinkedList<String>();
        dfs(path, s, 0, rst);
        return rst;
    }
}