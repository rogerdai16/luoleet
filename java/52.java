public class Solution {
    
    private boolean check(int[] queens, int index, int value){
        for(int i = 0; i < index; i++){
            if(queens[i] == value) return false;
            if(Math.abs(index - i) == Math.abs(value - queens[i])) return false;
        }
        return true;
    }
    
    private int dfs(int[] queens, int rst, int idx){
        if(idx == queens.length){
            return rst + 1;
        }
        for(int i = 0; i < queens.length; i++){
            if(check(queens, idx, i)){
                queens[idx] = i;
                rst = dfs(queens, rst, idx + 1);
            }
        }
        return rst;
    }
    
    public int totalNQueens(int n) {
        int rst = 0;
        if(n <= 0) return rst;
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        rst = dfs(queens, rst, 0);
        return rst;
    }
}