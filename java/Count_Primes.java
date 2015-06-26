public class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] nonPrime = new boolean[n];
        int rst = n - 2;
        int i = 2;
        double end = Math.sqrt(n);
        while (i < end) {
            if (nonPrime[i - 1] == false) {
                int j = i * 2;
                while (j < n) {
                    if (nonPrime[j - 1] == false) rst--;
                    nonPrime[j - 1] = true;
                    j += i;
                }
            }
            if (i != 2) i += 2;
            else i++;
        }
        return rst;
    }
}