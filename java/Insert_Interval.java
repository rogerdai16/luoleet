public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals == null || newInterval == null) return null;
        Iterator<Interval> iter = intervals.iterator();
        List<Interval> rst = new LinkedList<Interval>();
        Interval curr;
        int position = 0;
        while(iter.hasNext()){
            curr = iter.next();
            if(curr.start > newInterval.end) rst.add(curr);
            else if(newInterval.start > curr.end){
                rst.add(curr);
                position++;
            }else{
                newInterval.start = Math.min(newInterval.start, curr.start);
                newInterval.end = Math.max(newInterval.end, curr.end);
            }
        }
        rst.add(position, newInterval);
        return rst;
    }
}