public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if(n < 0) return result;
        for(long i = 0; i < (long)Math.pow(2, n); i++){
            result.add((int)(i ^ (i >> 1)));
        }
        return result;
    }
}