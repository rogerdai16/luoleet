public class Solution {

	private ArrayList < ArrayList < Integer >> permuteHelper(ArrayList < Integer > all) {
		ArrayList < ArrayList < Integer >> localRst = new ArrayList < ArrayList < Integer >> ();
		if (all.size() == 0) return localRst;
		if (all.size() == 1) {
			localRst.add(all);
			return localRst;
		}
		Integer prev = null;
		for (int i = 0; i < all.size(); i++) {
			if (prev != null && prev.equals(all.get(i))) continue;
			Integer curr = all.remove(i);
			ArrayList < ArrayList < Integer >> subRst = permuteHelper(all);
			for (int j = 0; j < subRst.size(); j++) {
				ArrayList tmp = new ArrayList < Integer > (subRst.get(j));
				tmp.add(0, curr);
				localRst.add(tmp);
			}
			all.add(i, curr);
			prev = curr;
		}
		return localRst;

	}

	public ArrayList < ArrayList < Integer >> permuteUnique(int[] nums) {
		ArrayList < ArrayList < Integer >> rst = new ArrayList < ArrayList < Integer >> ();
		if (nums == null || nums.length == 0) return rst;
		ArrayList < Integer > all = new ArrayList < Integer > ();
		Arrays.sort(nums);
		for (int i: nums) all.add(i);
		rst = permuteHelper(all);
		return rst;
	}
}