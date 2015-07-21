import java.util.Scanner;

/**
 * Created by Qinghao on 7/18/2015.
 */
public class Solution {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
////        System.out.println(line.length());
//        int[] counts = new int[256];
//        for(int i = 0; i < line.length(); i++) counts[line.charAt(i)]++;
//        if(line.length() % 2 == 0){
//            for(int c : counts){
//                if(c % 2 != 0){
//                    System.out.println("false");
//                    System.exit(0);
//                }
//            }
//        }else{
//            boolean found = false;
//            for(int c : counts){
//                if(c % 2 != 0 && found){
//                    System.out.println("false");
//                    System.exit(0);
//                }
//                else if(c % 2 != 0) found = true;
//            }
//        }
//        System.out.println("true");
//        System.out.println(-Integer.MIN_VALUE);
//        System.out.println(getNeg(Integer.MAX_VALUE));
        System.out.println(~Integer.MIN_VALUE);
//        System.out.println(flipSign(100));

    }

    private static int getNeg(int n){
        return ~n + 1;
    }

    private static int flipSign(int n){
        return n ^ (0b10000000000000000000000000000000);
    }


}
