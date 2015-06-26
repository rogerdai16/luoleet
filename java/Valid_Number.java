public class Solution {
    public boolean isNumber(String s) {
        if(s == null){
            return false;
        }
        int left = 0;
        int right = s.length() - 1;
        while(left < right && s.charAt(left) == ' ' ){
            left++;
        }
        while(right > left && s.charAt(right) == ' '){
            right--;
        }
        if(s.charAt(left) == '+' || s.charAt(left) == '-'){
            left++;
        }
        boolean hasE = false;
        boolean hasDot = false;
        boolean hasNum = false;
        while(left <= right){
            if(s.charAt(left) >= '0' && s.charAt(left) <= '9'){
                hasNum = true;
            }else if(s.charAt(left) == 'e'){
                if(hasE == true || hasNum == false || left == right){
                    return false;
                }
                hasE = true;
                hasNum = false;
            }else if(s.charAt(left) == '.'){
                if(hasE == true || hasDot == true){
                    return false;
                }
                hasDot = true;
            }else if(s.charAt(left) == '+' || s.charAt(left) == '-'){
                if(s.charAt(left - 1) != 'e'){
                    return false;
                }
            }else{
                return false;
            }
            left++;
        }
        return hasNum;
    }
}