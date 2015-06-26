public class Solution {
    public int jump(int[] A) {
    	int count = 0;
    	int reach = 0;
    	int fuel = 0;
    	for(int i = 0; i < A.length; i++){
    		if(i > fuel){
    			fuel = reach;
    			count++;
    		}
    		reach = Math.max(reach, i + A[i]);
    	}
    	return count;
        
    }
}