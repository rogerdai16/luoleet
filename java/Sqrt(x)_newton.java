public class Solution {
    public int mySqrt(int x) {
        double x0 = 1;
        do{
            x0 = (x0+ x/x0)/2;
        }while(Math.abs(Math.pow(x0, 2) - x) >= 1);
        return (int)x0;
    }
}