public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null) return false;
        boolean[] filled = new boolean[9];
        for(int i = 0; i < 9; i++){
            Arrays.fill(filled, false);
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if(filled[board[i][j] - '1'] == false) filled[board[i][j] - '1'] = true;
                else return false;
            }
        }
        for(int i = 0; i < 9; i++){
            Arrays.fill(filled, false);
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.') continue;
                if(filled[board[j][i] - '1'] == false) filled[board[j][i] - '1'] = true;
                else return false;
            }
        }
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                Arrays.fill(filled, false);
                for(int row = 0; row < 3; row++){
                    for(int column = 0; column < 3; column++){
                        if(board[i + row][j + column] == '.') continue;
                        if(filled[board[i + row][j + column] - '1'] == false) filled[board[i + row][j + column] - '1'] = true;
                        else return false;
                    }
                }
            }
        }
        return true;
        
    }
}