class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int res = 0;
        int max_count = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (arr[i][j] == 1) {
                    count++;
                    res = Math.max(res, count);
                } else {
                    break;
                }
            }
            if (max_count < count) {
                max_count = count;
                index = i;
            }
        }
        return index;
    }
}