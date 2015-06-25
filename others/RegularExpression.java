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
                if (sPos == s.length() && pPos == p.length()) return true; // to the end
                if (sPos == s.length() && pPos < p.length() - 1 && p.charAt(pPos + 1) == '*') return _isMatch(s, sPos, p, pPos + 2);
                return false;
            }
            //not match at current position, if no *, then match failed
            //Otherwise we can skip the current * in the regex and continue
            //to next match.
            if (s.charAt(sPos) != p.charAt(pPos) && p.charAt(pPos) != '.') {
                //no *, match failed
                if (pPos == p.length() - 1 || p.charAt(pPos + 1) != '*')
                    return false;
                //skip the *
                return _isMatch(s, sPos, p, pPos + 2);
            }
            //match at current position, if no *, then continue to match the next
            //position both in text and regex.
            //Otherwise try to match one more chars and provide states for backtrack
            if (pPos == p.length() - 1 || p.charAt(pPos + 1) != '*') return _isMatch(s, sPos + 1, p, pPos + 1);
            return _isMatch(s, sPos + 1, p, pPos) || _isMatch(s, sPos, p, pPos + 2);
        }
    }
}
