/*
11. Container With Most Water : https://leetcode.com/problems/container-with-most-water/
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
*/



class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            // Width is the distance between the two pointers
            int width = right - left;
            
            // Height is bounded by the shorter of the two vertical lines
            int currentHeight = Math.min(height[left], height[right]);
            
            // Calculate current area and update maxArea if it's larger
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);
            
            // Move the pointer that points to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}
