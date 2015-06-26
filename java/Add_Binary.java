public class Solution {
    public String addBinary(String a, String b) {
        if(a == null && b == null) return null;
        if(a == null) return b;
        if(b == null) return a;
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int idx = 0; idx < Math.max(a.length(), b.length()); idx++){
            int val1 = idx >= a.length()? 0 : a.charAt(idx) - '0';
            int val2 = idx >= b.length()? 0 : b.charAt(idx) - '0';
            sb.append((val1 + val2 + carry) % 2);
            carry = (val1 + val2 + carry) / 2;
        }
        if(carry != 0) sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}