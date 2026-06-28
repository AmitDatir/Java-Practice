/*
73. Set Matrix Zeroes: https://leetcode.com/problems/set-matrix-zeroes/
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
*/



class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstColZero = false;

        // Step 1: Scan the matrix and use the first row & column as markers
        for (int i = 0; i < m; i++) {
            // Check if the first column needs to be zeroed out later
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
            
            // Scan the rest of the cells in the row
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark row
                    matrix[0][j] = 0; // Mark column
                }
            }
        }

        // Step 2: Iterate backwards to update cells based on markers
        // We go backwards to avoid overwriting the marker row prematurely
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            // Update the first column element if the column flag was true
            if (firstColZero) {
                matrix[i][0] = 0;
            }
        }
    }
}
