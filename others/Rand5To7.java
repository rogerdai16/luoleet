import java.util.Random;

/**
 * Created by Qinghao on 6/30/2015.
 */
public class Rand5To7 {

    private static Random r = new Random();

    public static int rand7(){
        int x = 0;
        do{
            x = r.nextInt(5) * 5 + r.nextInt(5);
        }while(x >= 21);
        return x % 7;
    }

    public static void main(String[] args){
        int[] count = new int[7];
        for(int i = 0; i < 10000; i++) count[rand7()]++;
        for(int i = 0; i < 7; i++) System.out.println(count[i]);
    }


}
