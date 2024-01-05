class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // row
        int n = matrix[0].length; // column

        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}
/*
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
		 return true;
	    } else if (matrix[i][j] > target) {
		 j--;
	    } else {
		 i++;
	    }
        }
        return false;
    }
*/