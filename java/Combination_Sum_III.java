public class Solution {
    
    private void dfs(int idx, ArrayList<Integer> path, List<List<Integer>> rst, int gap, int k){
        if(gap == 0 && path.size() == k){
            rst.add(new ArrayList<Integer>(path));
            return;
        }
        if(path.size() > k) return;
        for(int i = idx + 1; i <= 9; i++){
            if(i > gap) return;
            path.add(i);
            dfs(i, path, rst, gap - i, k);
            path.remove(path.size() - 1);
        }
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        dfs(0, path, rst, n, k);
        return rst;
    }
}