public class Solution {
	public String fractionToDecimal(int numerator, int denominator) {
		long numerat = (long) numerator;
		long denomina = (long) denominator;
		StringBuilder rst = new StringBuilder();
		if(Math.abs(Math.signum(numerat) - Math.signum(denomina)) >= 2)rst.append("-");
		numerat = Math.abs(numerat);
		denomina = Math.abs(denomina);
		rst.append(numerat / denomina);
		long mod = numerat % denomina;
		if (mod == 0)return rst.toString();
		rst.append(".");
		HashMap<Long, Integer> positions = new HashMap<Long, Integer>();
		while (mod != 0) {
			int digit = (int) (mod * 10 / denomina);
			if (!positions.containsKey(mod)) {
				rst.append(String.valueOf(digit));
				positions.put(mod, rst.length());
			} else {
				rst.insert(positions.get(mod) - 1, String.valueOf("("));
				rst.append(")");
				return rst.toString();
			}
			mod = (mod * 10) % denominator;
		}
		return rst.toString();
	}
}