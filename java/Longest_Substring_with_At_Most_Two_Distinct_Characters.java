public class Solution {
	public int lengthOfLongestSubstringTwoDistinct(String s) {
		int length = 0;
		int count = 0;
		int[] chars = new int[256];
		int start = 0;
		int end = 0;
		while(end < s.length()){
			if(chars[(int)s.charAt(end)] == 0)count++;
			chars[(int)s.charAt(end)]++;	
			while(count > 2){
				chars[(int)s.charAt(start)]--;
				if(chars[(int)s.charAt(start)] == 0)count--;
				start++;
			}
			length = Math.max(length, end - start + 1);
			end++;
		}
		return length;
	}
}