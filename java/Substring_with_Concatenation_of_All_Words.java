public class Solution {
    public ArrayList<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        if(s == null || s.length() == 0 || words == null || words.length == 0) return rst;
        int len = words[0].length();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String w : words){
            if(map.containsKey(w))map.put(w, map.get(w) + 1);
            else map.put(w, 1);
        }
        for(int i = 0; i < s.length() - (words.length * len) + 1; i++){
            if(map.containsKey(s.substring(i, i + len))){
                HashMap<String, Integer> match = (HashMap<String, Integer>)map.clone();
                for(int j = i; j < i + words.length * len; j += len){
                    String curr = s.substring(j, j + len);
                    if(match.containsKey(curr)){
                        match.put(curr, match.get(curr) - 1);
                        if(match.get(curr) == 0) match.remove(curr);
                    }else{
                        break;
                    }
                }
                if(match.isEmpty()) rst.add(i);
            }
        }
        return rst;
    }
}