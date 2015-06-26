public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        if(beginWord == null || endWord == null) return 0;
        wordDict.remove(beginWord);
        StringBuilder sb;
        LinkedList<String> queue = new LinkedList<String>();
        queue.addLast(beginWord);
        int length = 1;
        while(queue.size() > 0){
            int count = queue.size();
            for(int j = 0; j < count; j++){
                String curr = queue.pollFirst();
                sb = new StringBuilder(curr);                
                for(int i = 0; i < sb.length(); i++){
                    for(char c = 'a'; c <= 'z'; c++){
                        if(c == sb.charAt(i)) continue;
                        sb.setCharAt(i, c);
                        String next = sb.toString();
                        if(next.equals(endWord)) return length + 1;
                        if(wordDict.contains(next)){
                            queue.addLast(next);
                            wordDict.remove(next);
                        }
                    }
                    sb.setCharAt(i, curr.charAt(i));
                }
            }
            length++;
        }
        return 0;
    }
}