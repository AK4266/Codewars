public class rotationCount {
    public static void main(String[] args) {
        int nums[] = { 5, 6, 7, 1, 2, 3 };
        int rotateCount = firstPivot(nums) + 1;
        System.out.print(rotateCount);
    }

    // public static int pivot(int [] nums) {
    // int start = 0;
    // int end = nums.length - 1;
    // while(start < end){
    // int mid = start + (end - start) / 2;
    // if(nums[mid] > nums[mid + 1]) {
    // end = mid;
    // }
    // else if(nums[mid] < nums[mid + 1]) {
    // start = mid + 1;
    // }
    // }
    // return start + 1;
    // }
    public static int firstPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
