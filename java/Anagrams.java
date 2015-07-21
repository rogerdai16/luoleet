public class Solution {
    
    private String sort(String in){
        char[] arr = in.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public ArrayList<String> anagrams(String[] strs) {
        if(strs == null) return null;
        ArrayList<String> rst = new ArrayList<String>();
        HashMap<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
        for(String str : strs){
            String sorted = sort(str);
            if(map.containsKey(sorted)) map.get(sorted).add(str);
            else{
                LinkedList<String> tmp = new LinkedList<String>();
                tmp.add(str);
                map.put(sorted, tmp);
            }
        }
        for(Map.Entry<String, LinkedList<String>> e : map.entrySet()){
            if(e.getValue().size() < 2) continue;
            rst.addAll(e.getValue());
        }
        return rst;
    }
}