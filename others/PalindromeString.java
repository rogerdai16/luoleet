/**
 * Created by Qinghao on 6/27/2015.
 */
public class PalindromeString {
    public static boolean isPalindrome(String s){
        if(s == null) return false;
        int left = 0;
        int right = s.length() - 1;
        while(left < right && !Character.isLetterOrDigit(s.charAt(left)))left++;
        while(left < right && !Character.isLetterOrDigit(s.charAt(right)))right--;
        while(left < right){
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))left++;
            right--;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))right--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("abcoba"));
        System.out.println(isPalindrome("a@#$@%a"));
        System.out.println(isPalindrome("a^@#$@#"));
    }
}
