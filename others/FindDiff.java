/**
 * Created by Qinghao on 6/25/2015.
 */
public class FindDiff {
//    Given a sorted array (unique and sorted) and a target value, find two numbers in this array such that A - B = target
    public static void findDiff(int[] arr, int target){
        if(arr == null || arr.length < 2) return;
        int first = 0;
        int second = 1;
        while(first < second && second < arr.length){
            if(arr[second] - arr[first] == target){
                System.out.println("Second number is " + arr[second]);
                System.out.println("First number is " + arr[first]);
                System.out.println("Their diff is " + (arr[second] - arr[first]));
                return;
            }else if(arr[second] - arr[first] > target){
                first++;
            }else if(arr[second] - arr[first] < target){
                second++;
            }
        }
    }

    public static void main(String[] args){
        findDiff(new int[]{2,3,5,9}, 0);
    }
}
