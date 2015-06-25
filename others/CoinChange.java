/**
 * Created by Qinghao on 6/24/2015.
 */
public class CoinChange {

    public static long coinChange(int n, int[] coins){
        if(n <= 0 || coins == null || coins.length == 0) return 0;
        int m = coins.length;
        long[][] dp = new long[n + 1][m];
        for (int i = 0; i <= n; i++) dp[i][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < m; j++){
                long x = i - coins[j] >= 0? dp[i - coins[j]][j] : 0;
                long y = j - 1 >= 0? dp[i][j - 1] : 0;
                dp[i][j] = x + y;
            }
        }
        return dp[n][m - 1];
    }

    public static void main(String[] args){
        System.out.println("The coins change is " + coinChange(10, new int[]{1, 3}));
    }
}
