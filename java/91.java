class Solution{
  public int numDecodings(String s){
        if(s == null || s.length() == 0 || s.charAt(0) == '0') return 0;
        int prev = 0;
        int curr = 1;
        for(int i = 0; i < s.length(); i++){ // same as fibonacci
            if(s.charAt(i) == '0') curr = 0;
            if(i < 1 || !(s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6'))) prev = 0;
            if(curr == 0 && prev == 0) reutrn 0;
            int tmp = curr;
            curr = curr + prev;
            prev = curr;
        }
        return curr;
  }
}
