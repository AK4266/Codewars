class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++)
            ans += numberOfNegativesinrow(grid[i]);
        return ans;
    }

    public int numberOfNegativesinrow(int[] row) {
        int start = 0;
        int end = row.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (row[mid] >= 0) {
                start = mid + 1;
            } else if (row[mid] < 0) {
                ans += end - mid + 1;
                end = mid - 1;
            }
        }
        return ans;
    }
}