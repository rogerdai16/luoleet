public class Solution {
    /*
    
class Solution {
public:
    string getPermutation(int n, int k) {
        string ret;
        vector<int> factorial(n,1);
        vector<char> num(n,1);
        
        for(int i=1; i<n; i++) 
            factorial[i] = factorial[i-1]*i;
        
        for(int i=0; i<n; i++)
            num[i] = (i+1)+'0';
        
        k--;
        for(int i=n; i>=1; i--) {
            int j = k/factorial[i-1];
            k %= factorial[i-1];
            ret.push_back(num[j]);
            num.erase(num.begin()+j);
        }
        
        return ret;
    }
}; 

    */
    public String getPermutation(int n, int k) {
        if(k <= 0 || n < 1) return null;
        StringBuilder sb = new StringBuilder();
        // nums = [1,2,3,4,5,6,7,8]
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) nums.add(i);
        // get factorials, factorials = [1,1,2,6,24,120]
        int[] factorials = new int[n];
        factorials[0] = 1;
        for(int i = 1; i < factorials.length; i++) factorials[i] = i * factorials[i - 1];
        
        k--;
        // use while loop to compute
        while(n > 0){
            int idx = k / factorials[n - 1];
            sb.append(nums.remove(idx));
            k %= factorials[n - 1];
            n--;
        }
        return sb.toString();
    }
}