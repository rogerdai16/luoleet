/**
 * Created by Qinghao on 6/27/2015.
 * Given a string, add one to the number.
 */
public class AddOne {
    public static String add(String input) {
        if (input == null) return null;
        StringBuilder sb = new StringBuilder(input);
        int carry = 1;
        for (int i = sb.length() - 1; i >= 0; i--) {
            int curr = sb.charAt(i) - '0' + carry;
            sb.setCharAt(i, (char) ((curr % 10) + '0'));
            carry = curr / 10;
        }
        if (carry != 0) sb.insert(0, carry);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(add(""));
    }
}
