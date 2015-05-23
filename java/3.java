public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int[] repeat = new int[256];
        Arrays.fill(repeat, -1);
        int right = 0;
        int left = 0;
        int rst = 1;
        while(right < s.length()){
            if(repeat[s.charAt(right)] >= left){
                left = repeat[s.charAt(right)] + 1;
            }
            repeat[s.charAt(right)] = right;
            rst = Math.max(rst, right - left + 1);
            right++;
        }
        return rst;
    }
}