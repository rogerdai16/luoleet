public class Solution {
    
    private char[][] board;
    
    private boolean isValid(int x, int y){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length) return false;
        else return board[x][y] == 'O';
    }
    
    private void bfs(int x, int y){
        if(!isValid(x, y)) return;
        LinkedList<Integer> queue = new LinkedList<Integer>(); // each time, append two intergers to queue, first is x, second is y
        queue.addLast(x);
        queue.addLast(y);
        board[x][y] = 'D';
        while(queue.size() > 0){
            int i = queue.pollFirst();
            int j = queue.pollFirst();
            if(isValid(i + 1, j)){
            	queue.addLast(i + 1); 
            	queue.addLast(j);
            	board[i + 1][j] = 'D';
            }
            if(isValid(i - 1, j)){
            	queue.addLast(i - 1); 
            	queue.addLast(j);
            	board[i - 1][j] = 'D';
            }
            if(isValid(i, j + 1)){
            	queue.addLast(i); 
            	queue.addLast(j + 1);
            	board[i][j + 1] = 'D';
            }
            if(isValid(i, j - 1)){
            	queue.addLast(i); 
            	queue.addLast(j - 1);
            	board[i][j - 1] = 'D';
            }
        }
    }

    public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return;
        this.board = board;
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i++) bfs(i, 0);
        for(int i = 0; i < m; i++) bfs(i, n - 1);
        for(int j = 0; j < n; j++) bfs(0, j);
        for(int j = 0; j < n; j++) bfs(m - 1, j);
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(board[i][j] == 'D') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
    }
}