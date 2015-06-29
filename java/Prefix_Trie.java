class TrieNode {
    boolean end = false;
    TrieNode[] children;
    public TrieNode() {
        children = new TrieNode[26];
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if(word == null || word.length() == 0) return;
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(node.children[idx] == null) node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.end = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(word == null) return false;
        TrieNode node = root;
        int i = 0;
        while(i < word.length() && node != null){
            node = node.children[word.charAt(i) - 'a'];
            i++;
        }
        return i == word.length() && node != null && node.end == true;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(prefix == null) return false;
        TrieNode node = root;
        int i = 0;
        while(i < prefix.length() && node != null){
            node = node.children[prefix.charAt(i) - 'a'];
            i++;
        }
        return node != null;
    }
}