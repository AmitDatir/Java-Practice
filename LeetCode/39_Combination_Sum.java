/*
39. Combination Sum: https://leetcode.com/problems/combination-sum/
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
*/




class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        
        // Start backtracking from the 0th index
        backtrack(candidates, target, 0, currentCombination, result);
        
        return result;
    }

    private void backtrack(int[] candidates, int remainingTarget, int startIdx, 
                           List<Integer> currentCombination, List<List<Integer>> result) {
        // Base Case 1: Successfully reached the target sum
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        // Base Case 2: Exceeded the target sum, stop exploring this path
        if (remainingTarget < 0) {
            return;
        }

        // Explore valid choices starting from the 'startIdx' to avoid duplicate combinations
        for (int i = startIdx; i < candidates.length; i++) {
            // 1. Choose: Add the current candidate to our tracking path
            currentCombination.add(candidates[i]);

            // 2. Explore: Recur with updated target. Index stays 'i' because elements can be reused.
            backtrack(candidates, remainingTarget - candidates[i], i, currentCombination, result);

            // 3. Un-choose (Backtrack): Remove the last added element to test other branches
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
