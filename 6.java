public class Solution {
    public String convert(String s, int numRows) {
        if(s == null) return s;
        if(numRows <= 1 || s.length() <= 1) return s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            for(int j = 0, index = i; index < s.length(); j++, index = (2 * numRows - 2) * j + i){
                sb.append(s.charAt(index));
                if(i == 0 || i == numRows - 1) continue;
                if(index + (numRows - i - 1) * 2 < s.length()) sb.append(s.charAt(index + (numRows - i - 1) * 2));
            }
        }
        return sb.toString();
    }
}