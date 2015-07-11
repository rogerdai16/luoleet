/**
 * Created by Qinghao on 7/11/2015.
 * minimum window substring， target is a char set. return the window size
 */
public class MinWindowSet {

    public static int minWindow(String s, String set){
        if(s == null || set == null || s.length() == 0) return 0;
        boolean[] expected = new boolean[256];
        int[] appeared = new int[256];
        int count = 0;
        int left = 0;
        int right = 0;
        int start = -1;
        int rst = s.length();
        for(int i = 0; i < set.length(); i++) expected[set.charAt(i)] = true;
        while(right < s.length()){
            appeared[s.charAt(right)]++;
            if(expected[s.charAt(right)] == true && appeared[s.charAt(right)] == 1) count++;
            if(count == set.length()){
                while(left < right && (expected[s.charAt(left)] == false || (expected[s.charAt(left)] == true && appeared[s.charAt(left)] > 1))){
                    appeared[s.charAt(left)]--;
                    left++;
                }
                start = left;
                rst = Math.min(rst, right - left + 1);
            }
            right++;
        }
        if(rst != s.length()) {
            System.out.println("The substring is " + s.substring(start, start + rst));
            System.out.println("The size is " + rst);
        }
        return rst == s.length()? -1 : rst;
    }

    public static void main(String[] args){
        minWindow("aaa", "a");
        minWindow("aaa", "q");
        minWindow("", "ad");
        minWindow("aaaabbbcccddd", "b");
    }
}
