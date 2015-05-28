public class Solution {
    public int minDistance(String word1, String word2) {
        if(word1 == null && word2 == null) return 0;
        if(word1 == null || word1.length() == 0) return word2.length();
        if(word2 == null || word2.length() == 0) return word1.length();
        int m = word1.length();
        int n = word2.length();
        int[][] matrix = new int[m + 1][n + 1];
        matrix[0][0] = 0;
        for(int i = 1; i <= m; i++) matrix[i][0] = i;
        for(int i = 1; i <= n; i++) matrix[0][i] = i;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    matrix[i][j] = matrix[i - 1][j - 1];
                }else{
                    matrix[i][j] = Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]) + 1;
                }
            }
        }
        return matrix[m][n];
    }
}