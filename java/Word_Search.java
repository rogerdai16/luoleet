public class Solution {
    
    private boolean[][] visited;
    
    private boolean dfs(char[][] board, String word, int idx, int i, int j){
        if(idx >= word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] == true || board[i][j] != word.charAt(idx)) return false;
        idx++;
        visited[i][j] = true;
        boolean rst =  dfs(board, word, idx, i + 1, j) || dfs(board, word, idx, i - 1, j) || dfs(board, word, idx, i, j + 1) || dfs(board, word, idx, i, j - 1);
        visited[i][j] = false;
        return rst;
    }
    
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0) return false;
        this.visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
}