/**
 * Created by Qinghao on 6/27/2015.
 * ????????????????????????????
 */
public class DivideNewton {

    private static double eps = 1E-6;

    public static double divideNewton(double n){
        double x0 = 1;
        do{
            x0 = x0 * (2 - n * x0);
        }while(n * x0 - 1 >= eps);
        return x0;
    }

    public static void main(String[] args){
    }
}
