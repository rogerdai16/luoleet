public class Solution {
    public int divide(int dividend, int divisor) {
        long rst = 0;
        boolean negative = false;
        if(Math.abs(Math.signum(dividend) - Math.signum(divisor)) >= 2){
            negative = true;
        }
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        while(a >= b){
            long c = b;
            int loop = 0;
            while(a >= c){
                a -= c;
                rst += 1L << loop;
                c <<= 1;
                loop++;
            }
        }
        if(negative == false && rst >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(negative && -rst <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return negative? (int)-rst : (int)rst;
    }
}