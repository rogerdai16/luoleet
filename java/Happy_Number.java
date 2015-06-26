public class Solution {
    
    private int getNext(int n){
        int rst = 0;
        while(n != 0){
            rst += Math.pow(n % 10, 2);
            n /= 10;
        }
        return rst;
    }

    public boolean isHappy(int n) {
        if(n <= 0) return false;
        int slow = n;
        int fast = n;
        do{
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }while(fast != 1 && slow != fast);
        return fast == 1;
    }
}