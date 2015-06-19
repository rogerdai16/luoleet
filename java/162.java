public class Solution {
    public int findPeakElement(int[] num) {
        if(num == null || num.length == 0) return -1;
        int left = 0;
        int right = num.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mid == left) return num[left] > num[right]? left : right; // only two candidate to choose from
            if(num[mid] < num[mid + 1]) left = mid;
            else if(num[mid] > num[mid + 1]) right = mid;
        }
        return 0;
    }
}