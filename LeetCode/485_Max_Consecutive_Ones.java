/*
485. Max Consecutive Ones : https://leetcode.com/problems/max-consecutive-ones/description/
Given a binary array nums, return the maximum number of consecutive 1's in the array.
*/




public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
        	count++;
        	result = Math.max(count, result);
            }
            else count = 0;
        }
        
        return result;
    }
}
