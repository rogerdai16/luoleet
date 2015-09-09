public class Solution extends Relation {
    public int findCelebrity(int n) {
        if(n <= 1) return n;
        int candidate = 0;
        for(int i = 1; i < n; i++) if(!(knows(i, candidate) && !knows(candidate, i))) candidate = i;
        for(int i = 0; i < candidate; i++) if(!(knows(i, candidate) && !knows(candidate, i))) return -1;
        return candidate;
    }
}