public class Solution {
    public int majorityElement(int[] num) {
        if(num.length == 0)return -1;
        int rst = num[0];
        int count = 1;
        for(int i = 1; i < num.length; i++){
        	if(num[i] == rst)count++;
        	else count--;
        	if(count < 0){
        	    rst = num[i];
        	    count = 1;
        	}
        }
        return rst;
    }
}