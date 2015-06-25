/**
 * Created by Qinghao on 6/25/2015.
 */
public class AddBinary {
    public class Solution {
        public String addBinary(String a, String b) {
            if(a == null || b == null) return null;
            int carry = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < Math.max(a.length(), b.length()); i++){
                int val1 = a.length() - i - 1 >= 0? a.charAt(a.length() - i - 1) - '0' : 0;
                int val2 = b.length() - i - 1 >= 0? b.charAt(b.length() - i - 1) - '0' : 0;
                sb.insert(0, (val1 + val2 + carry) % 2);
                carry = (val1 + val2 + carry) / 2;
            }
            if(carry != 0) sb.insert(0, carry);
            return sb.toString();
        }
    }

    public static void main(String[] args){
        AddBinary me = new AddBinary();
        Solution s = me.new Solution();
        System.out.println(s.addBinary("", "101"));
    }


}
