public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split("\\s");
        HashMap<String, Character> mapstr = new HashMap<String, Character>();
        HashMap<Character, String> mapc = new HashMap<Character, String>();
        if(pattern.length() != strs.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            char tmpc = pattern.charAt(i);
            String tmpstr = strs[i];
            if(mapstr.containsKey(tmpstr) || mapc.containsKey(tmpc)){
                if(!mapstr.containsKey(tmpstr) || !mapc.containsKey(tmpc)) return false;
                if(!mapstr.get(tmpstr).equals(tmpc) || !mapc.get(tmpc).equals(tmpstr)) return false;
            }else{
                mapstr.put(tmpstr, tmpc);
                mapc.put(tmpc, tmpstr);
            }
        }
        return true;
    }
}