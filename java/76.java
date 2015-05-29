public class Solution {
    public String minWindow(String s, String t) {
        if(s == null && t == null) return null;
        if(s == null || t == null) return null;
        int[] expected = new int[256];
        int[] appeared = new int[256];
        for(int i = 0; i < t.length(); i++) expected[t.charAt(i)]++;
        int count = 0;
        int start = 0;
        int width = s.length();
        int left = 0;
        int right = 0;
        while(right < s.length()){
            appeared[s.charAt(right)]++;
            if(expected[s.charAt(right)] > 0){
                if(appeared[s.charAt(right)] <= expected[s.charAt(right)]) count++; // after adding it, less or equal then
                if(count == t.length()){
                    while(appeared[s.charAt(left)] > expected[s.charAt(left)]){
                        appeared[s.charAt(left)]--;
                        left++;
                    }
                    if(width > (right - left)){
                        width = right - left;
                        start = left;
                    }
                }
            }
            right++;
        }
        return width == s.length()? "" : s.substring(start, start + width + 1);
    }
}