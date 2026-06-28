/*
213. House Robber II: https://leetcode.com/problems/house-robber-ii/
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
*/



class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        // Return the max of robbing (House 0 to N-2) OR (House 1 to N-1)
        return Math.max(helper(nums, 0, nums.length - 2), 
                        helper(nums, 1, nums.length - 1));
    }
    
    private int helper(int[] nums, int start, int end) {
        int rob1 = 0; // Represents max money if we rob (i - 2)
        int rob2 = 0; // Represents max money if we rob (i - 1)
        
        for (int i = start; i <= end; i++) {
            int newRob = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = newRob;
        }
        return rob2;
    }
}
