public class Solution {
    
    private boolean isValidSudoku(char[][] board, int x, int y) {
        if(board == null) return false;
        boolean[] filled = new boolean[9];
        Arrays.fill(filled, false);
        for(int j = 0; j < 9; j++){
            if(board[x][j] == '.') continue;
            if(filled[board[x][j] - '1'] == false) filled[board[x][j] - '1'] = true;
            else return false;
        }
        
        Arrays.fill(filled, false);
        for(int j = 0; j < 9; j++){
            if(board[j][y] == '.') continue;
            if(filled[board[j][y] - '1'] == false) filled[board[j][y] - '1'] = true;
            else return false;
        }

        int i = (x / 3) * 3;
        int j = (y / 3) * 3;

        Arrays.fill(filled, false);
        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                if(board[i + row][j + column] == '.') continue;
                if(filled[board[i + row][j + column] - '1'] == false) filled[board[i + row][j + column] - '1'] = true;
                else return false;
            }
        }
        return true;
    }
    
    public void solveSudoku(char[][] board){
        boolean rst = solveSudokuHelper(board);
    }

    private boolean solveSudokuHelper(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    for(int num = 0; num < 9; num++){
                        board[i][j] = (char)('1' + num);
                        if(isValidSudoku(board, i, j) && solveSudokuHelper(board)) return true;
                        else board[i][j] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }
}