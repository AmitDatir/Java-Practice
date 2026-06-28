/*
59. Spiral Matrix II: https://leetcode.com/problems/spiral-matrix-ii/
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
*/



class Solution {
    public int[][] generateMatrix(int n) {
        // Initialize an n x n matrix
        int[][] matrix = new int[n][n];
        
        // Initialize boundary pointers
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        
        // Counter for numbers to insert
        int num = 1;
        int totalElements = n * n;
        
        // Loop until all numbers are filled
        while (num <= totalElements) {
            
            // 1. Fill Right across the top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; // Shrink top boundary down
            
            // 2. Fill Down along the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // Shrink right boundary left
            
            // 3. Fill Left across the bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--; // Shrink bottom boundary up
            
            // 4. Fill Up along the left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++; // Shrink left boundary right
        }
        
        return matrix;
    }
}
