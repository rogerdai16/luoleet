public class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int last = 1;
        int left = 1;
        int right = x / 2;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(x / mid == mid) return mid; // use division, to avoid overflow
            else if( x / mid > mid){
                left = mid + 1;
                last  = mid; // to record last mid position
            }else{
                right = mid - 1;
            }
        }
        return last;
    }
}