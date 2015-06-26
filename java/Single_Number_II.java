public class Solution {
    public int singleNumber(int[] A) {
        int sum = 0;
        int res=0;
        for(int i=0;i<32;i++){
            sum = 0;
            for(int j=0;j<A.length;j++){
                sum += A[j] & 1;
                A[j] >>>= 1;
            }
            sum %= 3;
            res += (sum & 1) << i;
        }
        return res;
    }
}