/**
 * Created by Qinghao on 7/21/2015.
 * classical solution
 */
public class LongestPalindromSubstring {
    private static String preProc(String s){
        if(s == null || s.length() == 0) return "^$";
        StringBuilder sb = new StringBuilder("^");
        for(int i = 0; i < s.length(); i++){
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#$");
        return sb.toString();
    }

    public static String longestPalinSubstr(String s){
        if(s == null || s.length() == 0) return s;
        String t = preProc(s);
        int[] p = new int[t.length()];
        int c = 0;
        int r = 0;
        for(int i = 1; i < p.length - 1; i++) { // very tricky part here
            int i_mirror = 2 * c - i;
            p[i] = r > i? Math.min(r - i, p[i_mirror]) : 0;
            while(t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) p[i]++;
            if(i + p[i] > r){
                c = i;
                r = i + p[i];
            }
        }
        int maxLen = 0;
        int centerIdx = 0;
        for(int i = 1; i < p.length - 1; i++){
            if(p[i] > maxLen){
                maxLen = p[i];
                centerIdx = i;
            }
        }
        return s.substring((centerIdx - 1 - maxLen) / 2, (centerIdx - 1 - maxLen) / 2 + maxLen);
    }

    public static void main(String[] args){
        System.out.println(longestPalinSubstr("sdfsdfsdffdsfdsfsd"));
    }
}
