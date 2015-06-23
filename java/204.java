public class Solution {
    public int countPrimes(int n) {
        if(n <= 0)return 0;
        boolean[] nonPrime = new boolean[n];
        int i = 2;
        while(i < Math.sqrt(n)){
            if(nonPrime[i - 1] == false){
                int j = i * 2;
                while(j <= n){
                    nonPrime[j - 1] = true;
                    j += i;
                }
            }
            if(i != 2) i += 2;
            else i++;
        }
        int count = 0;
        for(i = 2; i < n; i++) if(nonPrime[i - 1] == false) count++;
        return count;
    }
}