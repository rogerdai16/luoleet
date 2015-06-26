public class Solution {
    private String next(String in){
        StringBuilder sb = new StringBuilder();
        int sum = 1;
        for(int i = 1; i < in.length(); i++){
            if(in.charAt(i) == in.charAt(i - 1)){
                sum++;
            }else{
                sb.append(sum);
                sb.append(in.charAt(i - 1));
                sum = 1;
            }
        }
        sb.append(sum);
        sb.append(in.charAt(in.length() - 1));
        return sb.toString();
    }
    
    public String countAndSay(int n) {
        String rst = "1";
        while(--n != 0){
            rst = next(rst);
        }
        return rst;
    }
}