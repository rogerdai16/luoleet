public class Solution {
     
    private HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
    
    private void dfs(UndirectedGraphNode node){
        if(map.containsKey(node)) return;
        UndirectedGraphNode curr = new UndirectedGraphNode(node.label);
        curr.neighbors = new LinkedList<UndirectedGraphNode>();
        map.put(node, curr);
        for(UndirectedGraphNode neighbor : node.neighbors){
            dfs(neighbor);
            curr.neighbors.add(map.get(neighbor));
        }
    }
    
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        dfs(node);
        return map.get(node);
    }
}