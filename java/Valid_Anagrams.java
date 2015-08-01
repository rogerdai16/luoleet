public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        int[] counts = new int[256];
        for(int i = 0; i < s.length(); i++) counts[s.charAt(i)]++;
        for(int i = 0; i < t.length(); i++){
            counts[t.charAt(i)]--;
            if(counts[t.charAt(i)] < 0) return false;
        }
        return true;
    }
}