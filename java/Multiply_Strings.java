public class Solution {
    public String multiply(String num1, String num2) {
        if(num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0 || num1.charAt(0) == '0' || num2.charAt(0) == '0') return "0";// avoid the situation of '0000'
        int len1 = num1.length(), len2 = num2.length();
        int len = len1 + len2;
        int[] subrst = new int[len];
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                subrst[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        for(int i = len - 1; i > 0; i--){
            subrst[i - 1] += subrst[i] / 10;
            subrst[i] = subrst[i] % 10;
        }
        StringBuilder sb = new StringBuilder();
        if(subrst[0] != 0) sb.append(subrst[0]);
        for(int i = 1; i < len; i++){
            sb.append(subrst[i]);
        }
        return sb.toString();
    }
}
