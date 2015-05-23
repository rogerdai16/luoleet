public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        int left = 0;
        int right = str.length() - 1;
        while(str.charAt(left) == ' ') left++;
        while(str.charAt(right) == ' ') right--;
        boolean negative = false;
        if(str.charAt(left) == '-'){
            negative = true;
            left++;
        }else if(str.charAt(left) == '+'){
            left++;
        }
        long rst = 0;
        while(left <= right){
            if(str.charAt(left) < '0' || str.charAt(left) > '9') break;
            rst = rst * 10 + str.charAt(left) - '0';
            if(negative == false && rst > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(negative == true && -rst < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            left++;
        }
        return negative? -(int)rst : (int)rst;
    }
}