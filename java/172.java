/*
class Solution:
    # @return an integer
    def trailingZeroes(self, n):
        return 0 if n < 5 else n/5 + self.trailingZeroes(n/5)
*/

public class Solution {
    public int trailingZeroes(int n) {
        if(n < 5) return 0;
        else return n / 5 + trailingZeroes(n / 5);
    }
}