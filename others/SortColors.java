/**
 * Created by Qinghao on 7/16/2015.
 */
public class SortColors{
    public static void sortColors(int[] colors){
        if(colors == null) return;
        int left = 0;
        int right = colors.length - 1;
        int i = 0;
        while(i <= right){
            if(colors[i] == 0){
                swap(colors, i, left);
                left++;
                i++;
            }else if(colors[i] == 2){
                swap(colors, i, right);
                right--;
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] colors, int i, int j){
        int tmp = colors[i];
        colors[i] = colors[j];
        colors[j] = tmp;
    }

    public static void main(String[] args){
        int[] colors = new int[]{1,1,1,0,0,0,2,2,2,1,1,1,2,2,2,0,0,0,2,2,1,1,0,0,1,2,1,0,0};
        sortColors(colors);
        for(int i : colors) System.out.print(i);
    }
}
