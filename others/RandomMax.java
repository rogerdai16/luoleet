import java.util.Random;

/**
 * Created by Qinghao on 6/27/2015.
 * randomly return one of the indexes of maximum numbers. return the index
 */
public class RandomMax {
    public int randMax(int[] arr){
        if(arr == null || arr.length == 0) return -1;
        if(arr.length == 1) return arr[0];
        int count = 1;
        int max = arr[0];
        int rst = 0;
        Random r = new Random();
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == max){
                if(r.nextInt(++count) == 0) rst = i;
            }else if(arr[i] > max){
                count = 1;
                rst = i;
                max = arr[i];
            }
        }
        return rst;
    }
}
