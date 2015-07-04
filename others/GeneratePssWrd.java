import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Qinghao on 7/4/2015.
 */
public class GeneratePssWrd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            sc.nextLine();
            if(n > 0){
                int count = 0;
                LinkedList<String> rst = new LinkedList<String>();
                for(; n > 0; n--){
                    boolean modify = false;
                    String[] line = sc.nextLine().split(" ");
                    StringBuilder password = new StringBuilder(line[1]);
                    for(int i = 0; i < password.length(); i++){
                        if(password.charAt(i) == '1' || password.charAt(i) == '0' || password.charAt(i) == 'l' || password.charAt(i) == 'O'){
                            if(modify == false){
                                modify = true;
                                count++;
                            }
                            if(password.charAt(i) == '1'){
                                password.setCharAt(i, '@');
                            }else if(password.charAt(i) == '0'){
                                password.setCharAt(i, '%');
                            }else if(password.charAt(i) == 'l'){
                                password.setCharAt(i, 'L');
                            }else if(password.charAt(i) == 'O'){
                                password.setCharAt(i, 'o');
                            }
                        }
                    }
                    if(modify) rst.addLast(line[0] + " " + password.toString());
                }
                if(count > 0){
                    System.out.println(count);
                    for(String s : rst) System.out.println(s);
                }else System.out.println("No account is modified.");
            }
        }
    }
}
