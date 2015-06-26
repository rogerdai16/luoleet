public class Solution {
    private String getLetters(char c){
        switch(c){
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return "";
        }
    }
    
    private void dfs(String digits, StringBuilder path, int idx, ArrayList<String> rst){
        if(idx >= digits.length()){
            rst.add(path.toString());
            return;
        }
        String letters = getLetters(digits.charAt(idx));
        for(int i = 0; i < letters.length(); i++){
            path.append(letters.charAt(i));
            dfs(digits, path, idx + 1, rst);
            path.deleteCharAt(path.length() - 1);
        }
    }
    
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> rst = new ArrayList<String>();
        if(digits == null || digits.length() == 0) return rst;
        StringBuilder sb = new StringBuilder();
        dfs(digits, sb, 0, rst);
        return rst;
    }
}