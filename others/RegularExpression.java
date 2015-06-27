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
    }

    public static void main(String[] args){
        RegularExpression me = new RegularExpression();
        Solution s = me.new Solution();
//        System.out.println(s.isMatch("abcd", "abcd"));
        System.out.println(s.isMatch("abcd", "a.*A*"));
    }
}
