public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length == 0) return new int[]{-1, -1};
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j + 1};
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}