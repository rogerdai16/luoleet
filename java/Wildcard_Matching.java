public class Solution {
    public boolean isMatch(String s, String p) {
    	int ptr = 0;
    	int str = 0;
    	int ss = 0;
    	int star = -1;
    	while(str < s.length()){
    		if(ptr < p.length() && (s.charAt(str) == p.charAt(ptr) || p.charAt(ptr) == '?')){
    			str++;
    			ptr++;
    			continue;
    		}else if(ptr < p.length() && p.charAt(ptr) == '*'){
    			star = ptr;
    			ptr++;
    			ss = str;
    			continue;
    		}else if(star != -1){
    			ptr = star + 1;
    			ss++;
    			str = ss;
    			continue;
    		}
    		return false;
    	}
    	while(ptr < p.length() && p.charAt(ptr) == '*'){
    		ptr++;
    	}
    	return ptr == p.length();
    }
}