public class Solution {
    public boolean isPalindrome(int x) {
        int base = 1;
        int tmp = x;
        while(Math.abs(tmp) >= 10){
            base *= 10;
            tmp /= 10;
        }
        while(x != 0){
            if(Math.abs(x / base) != x % 10) return false;
            x = x % base / 10;
            base /= 100;
        }
        return true;
    }
}