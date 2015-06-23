public class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        PriorityQueue<Integer> pq = new PriorityQueue <Integer> (nums.length, new Comparator <Integer> () {
		    @Override
			public int compare(Integer arg0, Integer arg1) {
			    String s1 = arg0.toString() + arg1.toString();
			    String s2 = arg1.toString() + arg0.toString();
				return -s1.compareTo(s2);
			}
		});
		for(int i : nums) pq.offer(i);
		StringBuilder sb = new StringBuilder();
		while(pq.size() > 0) sb.append(pq.poll().toString());
		return sb.charAt(0) == '0'? "0" : sb.toString();
    }
}