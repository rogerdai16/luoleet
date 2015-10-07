public class Solution {
    public Solution(){
        mapping['6'] = '9';
        mapping['9'] = '6';
        mapping['1'] = '1';
        mapping['8'] = '8';
        mapping['0'] = '0';
    }
    private int[] mapping = new int[256];
    
    public boolean isStrobogrammatic(String num) {
        if(num == null || num.length() == 0) return false;
        int left = 0;
        int right = num.length() - 1;
        while(left <= right){
            if(mapping[num.charAt(left)] != num.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}