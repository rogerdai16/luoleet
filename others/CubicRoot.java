/**
 * Created by Qinghao on 6/27/2015.
 * Newton's method to solve cubic root
 */
public class CubicRoot {
    private static double eps = 1E-6;
    public static double cubicRoot(double n){
        double x0 = 4;
        do{
            x0 = (2d / 3d) * x0 + n / (3 * x0 * x0);
        }while(Math.abs(Math.pow(x0, 3) - n) >= eps);
        return x0;
    }
    public static void main(String[] args){
        System.out.println(cubicRoot(10));
    }
}
