/**
 * Created by Qinghao on 7/17/2015.
 */
public class SearchRotated {
    public static int searchRoated(int[] arr, int target){
        if(arr == null || arr.length == 0) return -1;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return mid;
            if(arr[left] <= arr[mid]){
                if(target >=  arr[left] && target < arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(target > arr[mid] && target <= arr[right]){
                    left = mid + 1;
                } else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(searchRoated(new int[]{8,9,10,2,3,4,5,6,7}, 100));
    }
}
