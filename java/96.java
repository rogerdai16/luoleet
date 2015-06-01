public class Solution {
    public int numTrees(int n) {
        if(n <= 0) return 0;
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i <= n; i++)
			for(int k = 1; k <= i; k++)
				arr[i] += arr[k - 1] * arr[i - k];
		return arr[n];
    }
}