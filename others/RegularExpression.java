/**
 * Created by Qinghao on 6/25/2015.
 * matching the regular expression
 */
public class RegularExpression {

    public class Solution {
        public boolean isMatch(String s, String p) {
            return _isMatch(s, 0, p, 0);
        }

        private boolean _isMatch(String s, int sPos, String p, int pPos) {
            if (sPos == s.length() || pPos == p.length()) {
                if (sPos == s.length() && pPos == p.length()) return true;
                if (sPos == s.length() && pPos < p.length() - 1 && p.charAt(pPos + 1) == '*')
                    return _isMatch(s, sPos, p, pPos + 2);
                return false;
            }
            if (s.charAt(sPos) != p.charAt(pPos) && p.charAt(pPos) != '.') {
                //no *, match failed
                if (pPos < p.length() - 1 && p.charAt(pPos + 1) == '*')
                    return _isMatch(s, sPos, p, pPos + 2);
                return false;
            }
            if (pPos == p.length() - 1 || p.charAt(pPos + 1) != '*') return _isMatch(s, sPos + 1, p, pPos + 1);
            return _isMatch(s, sPos + 1, p, pPos) || _isMatch(s, sPos, p, pPos + 2);
        }


        // dp solution
        private boolean isMatchDP(String s, String p){
            int m = s.length();
            int n = p.length();
            boolean[][] dp = new boolean[m + 1][n + 1];
            for(int i = 0; i <= m; i++)
                for(int j = 0; j <= n; j++){
                    if(j == 0){
                        dp[i][j] = i == 0;
                    }else if(i == 0){
                        if(j > 1 && p.charAt(j - 1) == '*') dp[i][j] = dp[i][j - 1] || dp[i][j - 2];
                    }else{
                        char sc = s.charAt(i - 1);
                        char pc = s.charAt(j - 1);
                        if(sc == pc || pc == '.') dp[i][j] = dp[i - 1][j - 1];
                        else if(j > 1 && pc == '*'){
                            if(((sc == p.charAt(j - 2) || p.charAt(j - 2) == '.')) && dp[i - 1][j]) dp[i][j] = true;// match previous one
                            else dp[i][j] = dp[i][j - 2];
                        }

                    }
                }
            return dp[m][n];
        }
    }


    private boolean wildCardMatch(String s, String p) {
        int ptr = 0;
        int str = 0;
        int ss = 0;
        int star = -1;
        while(str < s.length()){
            if(ptr < p.length() && (s.charAt(str) == p.charAt(ptr) || p.charAt(ptr) == '?')){
                str++;
                ptr++;
                continue;
            }else if(ptr < p.length() && p.charAt(ptr) == '*'){
                star = ptr;
                ptr++;
                ss = str;
                continue;
            }else if(star != -1){
                ptr = star + 1;
                ss++;
                str = ss;
                continue;
            }
            return false;
        }
        while(ptr < p.length() && p.charAt(ptr) == '*'){
            ptr++;
        }
        return ptr == p.length();
    }


    public static void main(String[] args){
        RegularExpression me = new RegularExpression();
        Solution s = me.new Solution();
        System.out.println(s.isMatch("abcd", "a.*A*"));
    }
}
