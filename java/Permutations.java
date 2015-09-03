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
    
    private List<List<Integer>> permuteHelper(List<Integer> all){
        List<List<Integer>> localRst = new ArrayList<List<Integer>>();
        if(all.size() == 0) return localRst;
        if(all.size() == 1){
            localRst.add(all);
            return localRst;
        }
        for(int i = 0; i < all.size(); i++){
            Integer curr = all.remove(i);
            List<List<Integer>> subRst = permuteHelper(all);
            for(int j = 0; j < subRst.size(); j++){
                ArrayList tmp = new ArrayList<Integer>(subRst.get(j));
                tmp.add(0, curr);
                localRst.add(tmp);
            }
            all.add(i, curr);
        }
        return localRst;
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) return rst;
        List<Integer> all = new ArrayList<Integer>();
        for(int i : nums) all.add(i);
        rst = permuteHelper(all);
        return rst;
    }
}