import java.util.Stack;

/**
 * Created by Qinghao on 7/12/2015.
 */
public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) return "empty";
        boolean[][] palindromes = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++) palindromes[i][i] = true;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(0) && ( i < 2 || palindromes[1][i - 1])) {
                palindromes[0][i] = true;
                System.out.println("String from 0 to " + i + " is palindrome");
            }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (palindromes[0][i]) return s.substring(i + 1) + s;
        }
        return "empty";
    }

    public static void main(String[] args) {
//        System.out.println(shortestPalindrome("aaaaaaaaa"));
        Stack<Integer> st = new Stack<Integer>();
//        st.push(null);
    }
}
