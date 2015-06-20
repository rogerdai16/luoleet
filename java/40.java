public class Solution {
    
    private void dfs(int[] candidates, ArrayList<Integer> path, int idx, ArrayList<ArrayList<Integer>> rst, int gap){
        if(gap == 0){
            rst.add(new ArrayList<Integer>(path));
            return;
        }
        if(idx >= candidates.length || candidates[idx] > gap) return;
        while(idx < candidates.length){
            if(candidates[idx] > gap) return;
            path.add(candidates[idx]);
            dfs(candidates, path, idx + 1, rst, gap - candidates[idx]);
            path.remove(path.size() - 1);
            // skip duplicate
            idx++;
            while(idx < candidates.length && candidates[idx] == candidates[idx - 1]) idx++;
        }
    }

    public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(candidates == null || candidates.length == 0) return rst;
        Arrays.sort(candidates);
        ArrayList<Integer> path = new ArrayList<Integer>();
        dfs(candidates, path, 0, rst, target);
        return rst;
    }
}