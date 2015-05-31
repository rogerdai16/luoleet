public class Solution{
	
	private int getVal(String substr){
		if(substr.length() > 1 && substr.charAt(0) == '0') return -1;
		return Integer.valueOf(substr).intValue();
	}
	
	private void dfs(StringBuilder path, int idx, int dots, String s, LinkedList<String> rst){
		if(idx >= s.length() && dots == 4){
			rst.addLast(path.substring(0, path.length() - 1));
			return;
		}
		if(dots == 4) return;
		for(int i = idx + 1; i <= Math.min(idx + 4, s.length()); i++){
			String sub = s.substring(idx, i);
			int val = getVal(sub);
			if(val != -1 && val <= 255){
				path.append(sub);
				path.append('.');
				dfs(path, i, dots + 1, s, rst);
				path.delete(path.length() - (sub.length() + 1), path.length());
			}
		}
	}
	
	public LinkedList<String> restoreIpAddresses(String s) {
		LinkedList<String> rst = new LinkedList<String>();
		if(s == null || s.length() == 0) return rst;
		StringBuilder sb = new StringBuilder();
		dfs(sb, 0, 0, s, rst);
		return rst;
	}
}