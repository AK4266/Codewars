class Solution {
    static int searchInsertK(int Arr[], int N, int k) {
        int start = 0;
        int end = N - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (Arr[mid] == k)
                return mid;
            else if (Arr[mid] > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}