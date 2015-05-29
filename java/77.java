public class Solution {
    
    private void dfs(LinkedList<Integer> path, int n, int level, int k, LinkedList<LinkedList<Integer>> rst){
        if(path.size() == k){
            rst.add(new LinkedList<Integer>(path));
            return;
        }
        for(int i = level; i <= n; i++){
            path.addLast(i);
            dfs(path, n, i + 1, k, rst);
            path.removeLast();
        }
    }
    
    public LinkedList<LinkedList<Integer>> combine(int n, int k) {
        LinkedList<LinkedList<Integer>> rst = new LinkedList<LinkedList<Integer>>();
        LinkedList<Integer> path = new LinkedList<Integer>();
        dfs(path, n, 1, k, rst);
        return rst;
    }
}