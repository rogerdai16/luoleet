public class FindPrime {

	public static void find(int n){
		if(n <= 1) return;
		boolean[] visited = new boolean[n + 1];
		int curr = 1;
		while(curr++ < n){
			if(visited[curr]) continue;
			System.out.println("The prime number is " + curr);
			int tmp = curr * 2;
			while(tmp <= n){
				visited[tmp] = true;
				tmp += curr;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		find(11);
	}
}
