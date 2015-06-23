public class Solution {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0) return 0;
        int rst = 0;
        int base = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            rst += base * (s.charAt(i) - 'A' + 1);
            base *= 26;
        }
        return rst;
    }
}