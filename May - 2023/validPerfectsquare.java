class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long start = 2;
        long end = num;
        while (start < end) {
            long mid = start + (end - start) / 2;
            long squ = mid * mid;
            if (squ == num) {
                return true;
            } else if (squ > num) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}