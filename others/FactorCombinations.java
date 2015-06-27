import java.util.LinkedList;

/**
 * Created by Qinghao on 6/25/2015.
 */
public class FactorCombinations {

    private static int f(){
        int[] arr = new int[]{3,7,1,11,5};
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            i++;
            if(i == j){
                return arr[i];
            }
            j--;
        }
        return arr[j];
    }


    private static void dfs(LinkedList<Integer> path, int n) {
        if (n == 1) {
            for (Integer i : path) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = path.isEmpty() ? 2 : path.peekLast(); i <= n; i++) {
            if (n % i == 0) {
                path.addLast(i);
                dfs(path, n / i);
                path.removeLast();
            }
        }
    }

    public static void factorCombinations(int n) {
        if (n <= 1) return;
        LinkedList<Integer> path = new LinkedList<Integer>();
        dfs(path, n);
    }


    public static void main(String[] args) {
//        System.out.println(~(-0) + 1); // take zero, flip all the bits and plus one, get zero
//        factorCombinations(28);
        System.out.println(f());
    }
}
