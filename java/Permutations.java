/*
void permute(char *a, int l, int r)
{
   int i;
   if (l == r)
     printf("%s\n", a);
   else
   {
       for (i = l; i <= r; i++)
       {
          swap((a+l), (a+i));
          permute(a, l+1, r);
          swap((a+l), (a+i)); //backtrack
       }
   }
}
*/
public class Solution {
    
    private ArrayList<ArrayList<Integer>> permuteHelper(ArrayList<Integer> all){
        ArrayList<ArrayList<Integer>> localRst = new ArrayList<ArrayList<Integer>>();
        if(all.size() == 0) return localRst;
        if(all.size() == 1){
            localRst.add(all);
            return localRst;
        }
        for(int i = 0; i < all.size(); i++){
            Integer curr = all.remove(i);
            ArrayList<ArrayList<Integer>> subRst = permuteHelper(all);
            for(int j = 0; j < subRst.size(); j++){
                ArrayList tmp = new ArrayList<Integer>(subRst.get(j));
                tmp.add(0, curr);
                localRst.add(tmp);
            }
            all.add(i, curr);
        }
        return localRst;
        
    }
    
    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(nums == null || nums.length == 0) return rst;
        ArrayList<Integer> all = new ArrayList<Integer>();
        for(int i : nums) all.add(i);
        rst = permuteHelper(all);
        return rst;
    }
}