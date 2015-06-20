public class Solution {
    
    private double myPowHelper(double x, long n){
        if(n == 0) return 1d;
        if(n == 1) return x;
        if(n < 0) return 1 / myPowHelper(x, -n);
        long half = n / 2;
        double value = myPowHelper(x, half);
        if(n % 2 == 0) return value * value;
        else return value * value * x;
    }
    
    public double myPow(double x, int n) {
        return myPowHelper(x, (long)n);
    }
}