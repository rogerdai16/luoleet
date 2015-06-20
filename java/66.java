public class Solution {
    public int[] plusOne(int[] digits) {
        LinkedList < Integer > rst = new LinkedList < Integer > ();
        if (digits == null || digits.length == 0) return digits;
        int carry = 1;
        for (int idx = digits.length - 1; idx >= 0; idx--) {
            rst.addFirst((digits[idx] + carry) % 10);
            carry = (digits[idx] + carry) / 10;
        }
        if (carry != 0) rst.addFirst(carry);
        int[] arr = new int[rst.size()];
        int i = 0;
        for (Integer e: rst) arr[i++] = e;
        return arr;
    }
}