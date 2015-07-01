/**
 * Created by Qinghao on 6/30/2015.
 */
public class Permutation {

    private static void swap(StringBuilder sb, int i, int j){
        char tmp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, tmp);
    }

    private static void printPer(StringBuilder sb, int left, int right){
        if(left == right) System.out.println(sb.toString());
        for(int i = left; i <= right; i++){
            swap(sb, left, i);
            printPer(sb, left + 1, right);
            swap(sb, left, i);
        }
    }

    public static void permutations(String input){
        if(input == null || input.length() == 0) return;
        printPer(new StringBuilder(input), 0, input.length() - 1);
    }


    public static void main(String[] args){
        permutations("12");
    }

}
