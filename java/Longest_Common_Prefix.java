public class Solution {
    
    private String getCommon(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.min(s1.length(), s2.length()); i++){
            if(s1.charAt(i) == s2.charAt(i)) sb.append(s1.charAt(i));
            else break;
        }
        return sb.toString();
    }
    
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String rst = strs[0];
        for(int i = 1; i < strs.length; i++) rst = getCommon(rst, strs[i]);
        return rst;
    }
}