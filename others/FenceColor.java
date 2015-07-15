/**
 * Created by Qinghao on 7/14/2015.
 * Write an algorithm that counts the number of ways you can paint a fence with N posts using K colors such that，
 * no more than 2 adjacent fence posts are painted with the same color.
 *
 * Solution : this is a variation of Fibonacci Number with a factor k.(for i = 1; i < n; i++)
 */
public class FenceColor {

    public static int getNumber(int n, int k){
        if(n < 1 || k <= 0) return 0;
        int prev = k;
        int curr = k * k;
        for(int i = 1; i < n; i++){
            int tmp = curr;
            curr = (k - 1) * (prev + curr);
            prev = tmp;
        }
        return prev;
    }

    public static void main(String[] args){
        System.out.println(getNumber(3, 2) + " is 6");
    }

}
