/*
128. Longest Consecutive Sequence: https://leetcode.com/problems/longest-consecutive-sequence/
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
*/





class Solution {
    public int longestConsecutive(int[] nums) {
        // Handle the edge case of an empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Insert all numbers into a HashSet to allow O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through each unique number in the set
        for (int num : numSet) {
            // Check if 'num' is the start of a sequence
            // If num - 1 exists, 'num' is NOT the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Expand the sequence forward
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Track the maximum length found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
