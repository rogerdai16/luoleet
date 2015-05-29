public class Solution {
    
/*    
  
class Solution:
    # @param A a list of integers
    # @param target an integer
    # @return a boolean
    def search(self, A, target):
        return target in A
        
*/  
    public boolean search(int[] nums, int target) {
        for(int i : nums) if(i == target) return true;
        return false;
    }
}