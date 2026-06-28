/*
54. Spiral Matrix: https://leetcode.com/problems/spiral-matrix/
Given an m x n matrix, return all elements of the matrix in spiral order.
*/



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        // Edge case handling for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        
        // Initialize boundary pointers
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        // Loop until boundaries overlap
        while (top <= bottom && left <= right) {
            
            // 1. Move Right across the top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // Shrink top boundary down
            
            // 2. Move Down along the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Shrink right boundary left
            
            // 3. Move Left across the bottom row (Check if row still exists)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Shrink bottom boundary up
            }
            
            // 4. Move Up along the left column (Check if column still exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Shrink left boundary right
            }
        }
        
        return result;
    }
}
