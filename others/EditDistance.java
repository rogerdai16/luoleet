/**
 * Created by Qinghao on 7/9/2015.
 * classical algorithm, edit distance
 */
public class EditDistance {
    public static int distance(String s, String t){
        if(s == null || t == null) return -1; // invalid input
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for(int i = 0; i <= s.length(); i++) dp[i][0] = i;
        for(int i = 0; i <= t.length(); i++) dp[0][i] = i;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= t.length(); j++){
                if(s.charAt(i) == t.charAt(j)) dp[i][j] = dp[i - 1][j - 1];
                else{
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[s.length()][t.length()];
    }

}
