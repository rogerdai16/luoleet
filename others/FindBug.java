/**
 * Created by Qinghao on 6/24/2015.
 */
public class FindBug {

    public static int find(boolean[] versions){
        // return the first false index
        if(versions == null || versions.length == 0) return -1;
        int left = 0;
        int right = versions.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(versions[mid] == false) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args){
        System.out.println(find(new boolean[]{true, true, false}));
        System.out.println(find(new boolean[]{false, false, false}));
        System.out.println(find(new boolean[]{true, true, true}));
    }

}
