public class Solution {
    public int minCut(String s) {
        if(s == null || s.length() <= 1) return 0;
        int len = s.length();
        int[] dp = new int[len];
        boolean[][] p = new boolean[len][len];
        for(int i = 0; i < len; i++) dp[i] = i; // at last, return dp[len - 1]
        for(int i = 0; i < len; i++){
            for(int j = i; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j) && (i - j < 2 || p[j + 1][i - 1])){
                    p[j][i] = true;
                    dp[i] = j != 0? Math.min(dp[i], dp[j - 1] + 1) : 0;
                }
            }
        }
        return dp[len - 1];
    }
}