/**
 * Created by Qinghao on 7/17/2015.
 */
public class Stock {

    public static int maxProfit(int[] prices){
        if(prices == null || prices.length == 0) return 0;
        int rst = 0;
        int min = prices[0];
        for(int p : prices){
            min = Math.min(min, p);
            rst = Math.max(rst, p - min);
        }
        return rst;
    }


    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{10,7,6,5,3,2}));
        System.out.println(maxProfit(new int[]{2,7,6,5,3,2}));
        System.out.println(maxProfit(null));
    }
}
