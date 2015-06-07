public class Solution {

	private void reverse(char[] s, int start, int end) {
		while (start < end) {
			char c = s[start];
			s[start] = s[end];
			s[end] = c;
			start++;
			end--;
		}
	}

	public void reverseWords(char[] s) {
		if (s == null || s.length == 0) return;
		reverse(s, 0, s.length - 1);
		int start = 0;
		while (start < s.length) {
			while (start < s.length && s[start] == ' ') start++;
			int end = start;
			while (end < s.length && s[end] != ' ') end++;
			reverse(s, start, end - 1);
			start = end;
		}
	}
}