public class Solution {
    
    private boolean check(int[] queens, int index, int value){
        for(int i = 0; i < index; i++){
            if(queens[i] == value) return false;
            if(Math.abs(index - i) == Math.abs(value - queens[i])) return false;
        }
        return true;
    }
    
    private String newRow(int n, int index){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) sb.append(".");
        sb.replace(index, index + 1, "Q");
        return sb.toString();
    }
    
    private void dfs(LinkedList<String> path, int[] queens, ArrayList<String[]> rst, int idx){
        if(idx == queens.length){
            rst.add(path.toArray(new String[path.size()]));
            return;
        }
        for(int i = 0; i < queens.length; i++){
            if(check(queens, idx, i)){
                queens[idx] = i;
                path.add(newRow(queens.length, i));
                dfs(path, queens, rst, idx + 1);
                path.removeLast();
            }
        }
    }

    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> rst = new ArrayList<String[]>();
        if(n <= 0) return rst;
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        LinkedList<String> path = new LinkedList<String>();
        dfs(path, queens, rst, 0);
        return rst;
    }
}