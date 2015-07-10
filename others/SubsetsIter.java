/**
 * Created by Qinghao on 7/8/2015.
 * Generate all subsets in an iterative way
 */
public class SubsetsIter {

    private static void printSubSets(int i, String s){
        for(int idx = 0; idx < s.length(); idx++){
            if((i & 1) == 1) System.out.print(s.charAt(idx));
            i >>>= 1;
        }
        System.out.println();
    }


    public static void subsets(String s){
        if(s == null || s.length() == 0) return;
        for(int i = 0; i < Math.pow(2, s.length()); i++) printSubSets(i, s);
    }

    public static void main(String[] args){
        subsets("123");
    }

}
