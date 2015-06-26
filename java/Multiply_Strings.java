public class Solution {
    public String multiply(String num1, String num2) {
        if(num1 == null || num2 == null || num1.length() ==0 || num2.length() == 0 || num1.charAt(0) == '0' || num2.charAt(0) == '0') return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int len = len1 + len2;
        int[] subRst = new int[len];
        int[] rst = new int[len];
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                subRst[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        for(int i = len - 1; i > 0; i--){
            if(subRst[i] > 9) subRst[i - 1] += subRst[i] / 10;
            rst[i] = subRst[i] % 10;
        }
        rst[0] += subRst[0];
        // use a stringbuilder to return
        StringBuilder sb = new StringBuilder();
        if(rst[0] != 0) sb.append(rst[0]);
        for(int i = 1; i < len; i++) sb.append(rst[i]);
        return sb.toString();
    }
}