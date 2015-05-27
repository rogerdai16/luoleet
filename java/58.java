public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        String[] words = s.split("\\s+");
        if(words.length == 0) return 0;
        if(words[words.length - 1].length() != 0) return words[words.length - 1].length();
        else return words[words.length - 2].length();
    }
}