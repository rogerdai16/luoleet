import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Qinghao on 7/7/2015.
 */
public class Zenefits {
    static boolean contains_bomb(int[] arr) {
        if(arr == null || arr.length < 6) return false;
        int idx = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        while(idx < arr.length){
            if(idx < arr.length - 1 && arr[idx] == arr[idx + 1]) set.add(arr[idx]);
            idx++;
            while(idx < arr.length && arr[idx] == arr[idx - 1]) idx++;
        }
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            Integer curr = iter.next();
            if(set.contains(curr.intValue() - 1) && set.contains(curr.intValue() + 1)) return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(contains_bomb(new int[]{0,0,0,0,0,0,0,1,1,3,3,3,3,3}));
    }
}
