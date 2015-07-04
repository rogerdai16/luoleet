import java.util.LinkedList;

/**
 * Created by Qinghao on 6/27/2015.
 * the variation of phone number combination: if you press "111" means 'aaa', or 'ba', or 'ab', or 'c'
 */
public class PhoneLetterCombination {
    private String getStr(int n){
        switch (n){
            case 2 : return "abc";
            case 3 : return "def";
            case 4 : return "ghi";
            case 5 : return "jkl";
            case 6 : return "mno";
            case 7 : return "pqrs";
            case 8 : return "tuv";
            case 9 : return "wxyz";
            default: return null;
        }
    }

    public LinkedList<String> phoneNumVar(String digits){
        LinkedList<String> rst = new LinkedList<String>();
        if(digits == null || digits.length() == 0) return rst;
        StringBuilder path = new StringBuilder();
        dfs(digits, 0, rst, path);
        return rst;
    }

    private void dfs(String digits, int i, LinkedList<String> rst, StringBuilder path) {
        if(i == digits.length()){
            rst.addLast(path.toString());
            return;
        }
        String candidates = getStr(digits.charAt(i) - '0');
        int j = i;
        while(j < digits.length() && digits.charAt(j) == digits.charAt(i)){
            path.append(candidates.charAt((j - i) % candidates.length()));
            dfs(digits, j + 1, rst, path);
            path.deleteCharAt(path.length() - 1);
            j++;
        }
    }
    public static void main(String[] args){
        PhoneLetterCombination me = new PhoneLetterCombination();
        for(String s : me.phoneNumVar("23456789")) System.out.println(s);
    }
}
