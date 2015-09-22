public class Solution {
    
    private void dfs(int[] candidates, ArrayList<Integer> path, int idx, List<List<Integer>> rst, int gap){
        if(gap == 0){
            rst.add(new ArrayList<Integer>(path));
            return;
        }
        if(candidates[idx] > gap) return;
        for(int i = idx; i < candidates.length && candidates[i] <= gap; i++){
            path.add(candidates[i]);
            dfs(candidates, path, i, rst, gap - candidates[i]);
            path.remove(path.size() - 1);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0) return rst;
        Arrays.sort(candidates);
        ArrayList<Integer> path = new ArrayList<Integer>();
        dfs(candidates, path, 0, rst, target);
        return rst;
    }
}