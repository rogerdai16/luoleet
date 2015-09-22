public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) return false;
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);
        for(int i = 0; i < s.length(); i++){
            if(map1[s.charAt(i)] == -1 || map2[t.charAt(i)] == -1){
                if(map1[s.charAt(i)] != -1 || map2[t.charAt(i)] != -1) return false;
                map1[s.charAt(i)] = t.charAt(i);
                map2[t.charAt(i)] = s.charAt(i);
            }else{
                if(map1[s.charAt(i)] != t.charAt(i) || map2[t.charAt(i)] != s.charAt(i)) return false;
            }
        }
        return true;
    }
}