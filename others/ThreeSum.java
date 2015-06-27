import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Qinghao on 6/25/2015.
 * FB practice
 */
public class ThreeSum {

    public static LinkedList<LinkedList<Integer>> threeSum(int[] arr, int target){
        LinkedList<LinkedList<Integer>> rst = new LinkedList<LinkedList<Integer>>();
        if(arr == null || arr.length == 0) return rst;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i;
            int right = arr.length - 1;
            int curr = arr[i];
            while(left <= right) {
                if (curr + arr[left] + arr[right] == target) {
                    LinkedList<Integer> tmp = new LinkedList<Integer>();
                    tmp.addLast(curr);
                    tmp.addLast(arr[left]);
                    tmp.addLast(arr[right]);
                    rst.addLast(tmp);
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (curr + arr[left] + arr[right] < target) {
                    left++;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                } else if (curr + arr[left] + arr[right] > target) {
                    right--;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }
            }
        }
        return rst;
    }

    public static void main(String[] args){
        LinkedList<LinkedList<Integer>> rst = threeSum(new int[]{2,2,3,4,1,2,3,5,6,3,4,6}, 12);
        for(LinkedList<Integer> l : rst) {
            for (Integer i : l) System.out.println(i);
            System.out.println("--------------");
        }
    }

}
