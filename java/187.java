public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> rst = new LinkedList<String>();
        if(s == null || s.length() == 0) return rst;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i <= s.length() - 10; i++){
            String curr = s.substring(i, i + 10);
            if(!map.containsKey(curr)) map.put(curr, 1);
            else{
                if(map.get(curr) == 1) rst.add(curr);
                map.put(curr, map.get(curr) + 1);
            }
        }
        return rst;
    }
}