public class SqrtDouble {
	
	private static double eps =1E-6;
	
	private static double sqrt(double n){
		double left = 0;
		double right = n / 2;
		while(Math.abs((right - left)) > eps){
			double mid = left + (right - left) / 2;
			if(Math.abs((Math.pow(mid, 2) - n)) <= eps) return mid;
			else if(Math.pow(mid, 2) > n) right = mid - eps;
			else if(Math.pow(mid, 2) < n) left = mid + eps;
		}
		return left;
	}

	public static void main(String[] args) {
		System.out.println(sqrt(16));
	}

}
