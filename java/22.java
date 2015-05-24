public class Solution {
    
    private void dfs(StringBuilder path, int n, int left, int right, ArrayList<String> rst){
        if(left == n && right == n){
            rst.add(path.toString());
            return;
        }
        if(left < n){
            path.append('(');
            dfs(path, n, left + 1, right, rst);
            path.deleteCharAt(path.length() - 1);
        }
        if(right < left){
            path.append(')');
            dfs(path, n, left, right + 1, rst);
            path.deleteCharAt(path.length() - 1);
        }
    }
    
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> rst = new ArrayList<String>();
        if(n <= 0) return rst;
        StringBuilder sb = new StringBuilder();
        dfs(sb, n, 0, 0, rst);
        return rst;
    }
}