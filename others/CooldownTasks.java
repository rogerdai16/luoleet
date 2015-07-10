import java.util.HashMap;

/**
 * Created by Qinghao on 7/8/2015.
 * Given a series of task, and a cooldown time, c. return the minimum time length to execute all tasks.
 * Two solutions:
 * 1. circular buffer with size c.
 * 2. hashmap to record last time of execution for each task
 * 3. use array, last = new int[256]. if each element is a char.
 */
public class CooldownTasks {

    static class Solution{
        public static boolean isFunny(String s){
            if(s == null) return false;
            if(s.length() == 0 || s.length() == 1) return true;
            int len = s.length();
            for(int i = 1; i <= s.length() / 2 + 1; i++){
                if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != Math.abs(s.charAt(len - 1 - i) - s.charAt(len - i))) return false;
            }
            return true;
        }
    }


    public static int totalTime(char[] tasks, int c) {
        int rst = tasks.length;
        HashMap<Character, Integer> last = new HashMap<Character, Integer>();
        for (int i = 0; i < tasks.length; i++) {
            int prev = last.containsKey(tasks[i]) ? last.get(tasks[i]) : -1;
            rst += prev == -1 || i - prev > c ? 0 : c - (i - prev);
            last.put(tasks[i], i);
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(totalTime(new char[]{'a', 'b', 'a', 'b'}, 2));
//        System.out.println(Solution.isFunny("abcxyz"));
    }


    public static boolean funny(String s){
        int len = s.length();
        for(int i = 1; i <= s.length() / 2 + 1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != Math.abs(s.charAt(len - 1 - i) - s.charAt(len - i))) return false;
        }
        return true;
    }
}
