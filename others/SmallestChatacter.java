/**
 * Created by Qinghao on 7/14/2015.
 * Given a sorted character array and a character, return the smallest character that is strictly larger than the search character.
 * If no such character exists, return the smallest character in the array.
 */
public class SmallestChatacter {
    public static char smallestChar(String s, char c){
        if(s == null || s.length() == 0) return 0;
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(s.charAt(mid) <= c) left = mid + 1;
            else right = mid;
        }
        return s.charAt(left) > c? s.charAt(left) : s.charAt(0);
    }

    public static void main(String[] args){
        System.out.println(smallestChar("cck", 'f'));
    }
}
