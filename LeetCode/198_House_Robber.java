/*
198. House Robber: https://leetcode.com/problems/house-robber/
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
*/




class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int prev = 0; // Represents the max loot from two houses ago
        int curr = 0; // Represents the max loot up to the previous house
        
        for (int num : nums) {
            // At each house, we choose the maximum between:
            // 1. Robbing the current house + loot from two houses ago (prev)
            // 2. Skipping the current house (loot remains curr)
            int temp = curr;
            curr = Math.max(num + prev, curr);
            prev = temp;
        }
        
        return curr;
    }
}
