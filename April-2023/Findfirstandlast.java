class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ind1 = -1;
        int ind2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ind1 = i;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ind2 = i;
            }
        }
        return new int[] { ind2, ind1 };
    }
}