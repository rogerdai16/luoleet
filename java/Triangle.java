public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0 ) return 0;
        int[] rst = new int[triangle.size()];
        // process the last line
        List<Integer> last = triangle.get(triangle.size() - 1);
        Iterator<Integer> iter = last.iterator();
        int idx = 0;
        while(iter.hasNext()) rst[idx++] = iter.next().intValue();
        for(int i = triangle.size() - 2; i >= 0; i--){
            iter = triangle.get(i).iterator();
            idx = 0;
            while(iter.hasNext()){
                rst[idx] = Math.min(rst[idx], rst[idx + 1]) + iter.next().intValue();
                idx++;
            }
        }
        return rst[0];
    }
}