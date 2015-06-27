/**
 * Created by Qinghao on 6/27/2015.
 * shift all zeros to the front of array, maintain the original order
 * first process non-zero elements, then set the rest to zeros
 */
public class ShiftZero {
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void shift(int[] arr){
        if(arr == null || arr.length == 0) return;
        int right = arr.length - 1;
        int i = arr.length - 1;
        while(i >= 0){
            if(arr[i] != 0) swap(arr, i, right--);
            i--;
        }
        while(i >= 0) arr[i--] = 0;
    }
    public static void main(String[] args){
        int[] input = new int[]{1,0,2,0,3,0,4,0,5,0,6,0,7,8};
        shift(input);
        for(int i : input) System.out.println(i);
    }
}
